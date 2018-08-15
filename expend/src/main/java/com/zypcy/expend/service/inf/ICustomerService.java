package com.zypcy.expend.service.inf;

import com.github.pagehelper.PageInfo;
import com.zypcy.expend.entity.Customer;
import com.zypcy.expend.util.MvcDataDto;

import java.util.List;

public interface ICustomerService {

    void add(Customer customer);

    void edit(Customer customer);

    void delete(int id);

    Customer getById(int id);

    List<Customer> listByAll();

    PageInfo<Customer> listPages(MvcDataDto param);
}
