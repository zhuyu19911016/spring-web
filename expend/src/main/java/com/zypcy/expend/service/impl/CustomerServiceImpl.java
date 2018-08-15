package com.zypcy.expend.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zypcy.expend.dao.CustomerMapper;
import com.zypcy.expend.entity.Customer;
import com.zypcy.expend.service.inf.ICustomerService;
import com.zypcy.expend.util.MvcDataDto;
import com.zypcy.expend.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements ICustomerService {

    @Autowired private CustomerMapper customerMapper;

    @Override
    public void add(Customer customer) {
        customerMapper.insert(customer);
    }

    @Override
    public void edit(Customer customer) {
        customerMapper.updateByPrimaryKey(customer);
    }

    @Override
    public void delete(int id) {
        customerMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Customer getById(int id) {
        return customerMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Customer> listByAll() {
        return customerMapper.listByAll();
    }

    /**
     * 获取翻页列表
     * @param param
     * @return
     */
    @Override
    public PageInfo<Customer> listPages(MvcDataDto param) {
        PageInfo<Customer> customers = null;
        Page page = param.getPage();
        if(page != null){
            PageHelper.startPage(page.getCurrentPage() , page.getPageSize());
            List<Customer> list = customerMapper.listPages();
            customers = new PageInfo<>(list);
        }
        return customers;
    }
}
