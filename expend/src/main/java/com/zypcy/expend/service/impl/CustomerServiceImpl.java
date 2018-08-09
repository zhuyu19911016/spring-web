package com.zypcy.expend.service.impl;

import com.zypcy.expend.dao.CustomerMapper;
import com.zypcy.expend.entity.Customer;
import com.zypcy.expend.service.inf.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
