package com.zypcy.expend.service.inf;

import com.zypcy.expend.entity.User;

import java.util.List;

public interface IUserService {

    void add(User user);

    void edit(User user);

    void delete(int id);

    User findById(int id);

    User findByName(String name);

    List<User> findAll();
}
