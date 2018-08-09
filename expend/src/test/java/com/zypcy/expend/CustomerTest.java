package com.zypcy.expend;

import com.alibaba.fastjson.JSON;
import com.zypcy.expend.entity.Customer;
import com.zypcy.expend.service.inf.ICustomerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerTest {
    @Test
    public void contextLoads() {
    }

    /*
    @Autowired private ICustomerService customerService;

    @Test
    public void add(){
        Customer customer = new Customer();
        customer.setAge(26);
        customer.setIsUse(true);
        customer.setName("zy");
        customerService.add(customer);
    }

    @Test
    public void delete(){
        customerService.delete(13);
    }

    @Test
    public void edit(){
        Customer customer = new Customer();
        customer.setId(13);
        customer.setAge(27);
        customer.setIsUse(false);
        customer.setName("zy1");
        customerService.edit(customer);
    }

    @Test
    public void getById(){
        Customer customer = customerService.getById(13);
        System.out.println("customer:"+ JSON.toJSONString(customer));
    }
    */
}
