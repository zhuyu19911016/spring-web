package com.zypcy.expend;

import com.alibaba.fastjson.JSON;
import com.zypcy.expend.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MongodbTest {

    @Test
    public void contextLoads() {
    }

    /*
    @Autowired private MongoTemplate mongoTemplate;

    @Test
    public void add(){
        User user = new User();
        user.setId(1);
        user.setName("zhuyu");
        user.setAge(26);
        mongoTemplate.insert(user , "User");
    }
    @Test
    public void edit(){
        Query query = new Query(Criteria.where("name").is("zhuyu"));
        Update update = new Update();
        update.set("name","zy");
        update.set("age",24);
        mongoTemplate.updateFirst(query , update , "User");
    }
    @Test
    public void del(){
        Query query = new Query(Criteria.where("name").is("zy"));
        mongoTemplate.remove(query , "User");
    }
    @Test
    public void getById(){
        Query query = new Query(Criteria.where("name").is("zy"));
        User user = mongoTemplate.findOne(query,User.class,"User");
        System.out.println(JSON.toJSONString(user));
    }
    */
}
