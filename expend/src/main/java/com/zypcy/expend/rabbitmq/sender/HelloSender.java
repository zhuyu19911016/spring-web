package com.zypcy.expend.rabbitmq.sender;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class HelloSender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    /**
     * 发送消息
     * @param queueName 队列名称
     * @param message 消息内容
     */
    public void send(String queueName, String message){
        rabbitTemplate.convertAndSend(queueName,message);
    }
}
