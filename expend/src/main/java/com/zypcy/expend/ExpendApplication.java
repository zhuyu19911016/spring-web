package com.zypcy.expend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.zypcy.expend.dao")
@SpringBootApplication
public class ExpendApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExpendApplication.class, args);
	}
}
