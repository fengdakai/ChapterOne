package com.fk.ChapterOne.controller;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Author: KaiFeng
 * @Description: 消息生产者Sender
 * @Date: 2017/8/24
 * @Modifyed By:
 */
@Component
public class Sender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send() {
        String context = "hello " + new Date();
        System.out.println("Sender :" + context);
        this.amqpTemplate.convertAndSend("hello", context);
    }
}
