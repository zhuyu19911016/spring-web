package com.zypcy.expend.controller;

import com.alibaba.fastjson.JSON;
import com.zypcy.expend.entity.Customer;
import com.zypcy.expend.service.inf.ICustomerService;
import com.zypcy.expend.util.MvcDataDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("customers")
public class CustomerController {

    @Autowired private ICustomerService customerService;

    //所有数据
    @RequestMapping("list")
    public String list(ModelMap map){
        map.addAttribute("customers",customerService.listByAll());
        return "customer/list";
    }

    //打开翻页页面
    @RequestMapping("pages")
    public String listPages(){
        return "customer/pages";
    }

    //返回翻页数据
    @ResponseBody
    @RequestMapping("getListPage")
    public Object getListPage(String param){
        MvcDataDto data = JSON.parseObject(param , MvcDataDto.class);
        return customerService.listPages(data);
    }

    @RequestMapping("edit")
    public String edit(ModelMap map, @RequestParam(defaultValue = "0") int id){
        //isAdd : 向前端页面返回一个是新增与编辑的标识
        if(id > 0){
            map.addAttribute("isAdd",false);
            map.addAttribute("customer",customerService.getById(id));
        }else{
            map.addAttribute("isAdd",true);
            map.addAttribute("customer",new Customer());
        }
        return "customer/edit";
    }

    //新增和编辑
    @ResponseBody
    @RequestMapping("save")
    public String save(@ModelAttribute Customer customer){
        if(customer == null){
            return "fail";
        }
        if(customer.getId() != null && customer.getId() > 0){
            customerService.edit(customer);
        }else{
            customerService.add(customer);
        }
        return "success";
    }


    @RequestMapping(value = "/del/{id}" , method = RequestMethod.GET)
    public String delete(@PathVariable int id){
        customerService.delete(id);
        return "redirect:/customers/list";
    }

}
