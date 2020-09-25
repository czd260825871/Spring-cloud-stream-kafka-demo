package com.czd.demo.service;

import com.czd.demo.entity.User;
import com.czd.demo.kafka.producer.CustomSendService;
import com.czd.demo.kafka.producer.SendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author admin
 */
@Service
public class DemoService {

    @Autowired
    private SendService sendService;

    @Autowired
    private CustomSendService customSendService;


    public void send(User user){
        sendService.send(user);
    }


    public void sendMessage(User user){
        customSendService.sendMessage(user);
    }
}
