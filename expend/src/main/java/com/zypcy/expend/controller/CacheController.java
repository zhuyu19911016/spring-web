package com.zypcy.expend.controller;

import com.zypcy.expend.entity.Customer;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("cache")
public class CacheController {

    @RequestMapping("listCustomers")
    @Cacheable( value = "listCustomers" , key = "#length", sync = true)
    public List<Customer> listCustomers(Long length){
        List<Customer> customers = new ArrayList<>();
        for(int i=1; i <= length ; i ++){
            Customer customer = new Customer(i, "zhuyu"+i, 20 + i, false);
            customers.add(customer);
        }
        return customers;
    }

}
