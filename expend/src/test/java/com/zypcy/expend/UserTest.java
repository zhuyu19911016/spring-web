package com.zypcy.expend;

import com.alibaba.fastjson.JSON;
import com.zypcy.expend.entity.User;
import com.zypcy.expend.service.inf.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {

    @Test
    public void contextLoads() {
    }

    /*
    @Autowired private IUserService userService;

    @Test
    public void add(){
        User user = new User();
        user.setName("zy");
        user.setAge(26);
        userService.add(user);
    }

    @Test
    public void edit(){
        User user = new User();
        user.setId(1);
        user.setName("zy1");
        user.setAge(22);
        userService.edit(user);
    }

    @Test
    public void delete(){
        userService.delete(1);
    }

    @Test
    public void findById(){
        User user = userService.findById(1);
        System.out.println("user content :" + JSON.toJSONString(user));
    }

    @Test
    public void findByName(){
        User user = userService.findByName("zy1");
        System.out.println("user content :" + JSON.toJSONString(user));
    }

    @Test
    public void findAll(){
        List<User> list = userService.findAll();
        System.out.println("user content :" + JSON.toJSONString(list));
    }
    */
}
