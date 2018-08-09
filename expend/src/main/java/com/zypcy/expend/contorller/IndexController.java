package com.zypcy.expend.contorller;

import com.zypcy.expend.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String home(){
        return "dataPage";
    }

    @RequestMapping("/index")
    public String index(ModelMap model){
        List<User> list = new ArrayList<User>();
        for(int i=1 ; i < 10 ; i++){
            User user = new User();
            user.setId(i);
            user.setAge(19 + i);
            user.setName("zy" + i);
            list.add(user);
        }

        model.addAttribute("date","2018-07-26");
        model.addAttribute("user",list.get(1));
        model.addAttribute("users",list);
        return "index";
    }

    @ResponseBody
    @RequestMapping("/getUserInfo")
    public String getUserInfo(){
        return "name:zy,age:26";
    }
}
