package com.zypcy.expend;

import com.zypcy.expend.rabbitmq.sender.HelloSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitMQTest {

    @Test
    public void contextLoads() {
    }
    /*
    @Autowired
    private HelloSender helloSender;

    @Test
    public void sendMessage(){
        helloSender.send("hello","你好，我要向队列发送消息...");
    }

    @Test
    public void sendManyMessage(){
        for (int i=0;i<5;i++){
            helloSender.send("hello","你好，我要向队列发送消息1..."+i);
            helloSender.send("hello","你好，我要向队列发送消息2..."+i);
        }
    }*/
}
