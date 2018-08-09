package com.zypcy.expend;

import com.alibaba.fastjson.JSON;
import com.zypcy.expend.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {

    @Test
    public void contextLoads() {
    }

    /*
    @Autowired private StringRedisTemplate redisTemplate;

    @Test
    public void testRedis(){
        String name = redisTemplate.opsForValue().get("name");
        System.out.println("name:"+name);
    }

    @Test
    public void add(){
        User user = new User();
        user.setName("zy");
        user.setAge(26);
        redisTemplate.opsForValue().set("user", JSON.toJSONString(user));
    }*/
}
