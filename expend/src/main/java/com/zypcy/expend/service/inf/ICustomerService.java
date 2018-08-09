package com.zypcy.expend.service.inf;

import com.zypcy.expend.entity.Customer;

public interface ICustomerService {

    void add(Customer customer);

    void edit(Customer customer);

    void delete(int id);

    Customer getById(int id);
}
