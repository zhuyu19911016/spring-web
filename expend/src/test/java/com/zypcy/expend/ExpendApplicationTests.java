package com.zypcy.expend;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ExpendApplicationTests {

	@Test
	public void contextLoads() {
	}

	/*
	@Autowired private StringRedisTemplate redisTemplate;

	@Test
	public void testRedisCluster(){
		redisTemplate.opsForValue().set("name","zhuyu1");
		redisTemplate.opsForValue().set("name1","zhuyu");
		System.out.println(redisTemplate.opsForValue().get("name1"));
	}*/

}
