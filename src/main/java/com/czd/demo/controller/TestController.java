package com.czd.demo.controller;

import com.czd.demo.entity.User;
import com.czd.demo.service.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.time.LocalDateTime;

/**
 * @author admin
 */
@RequestMapping(value = "/test")
@RestController
public class TestController {

    @Resource
    private DemoService demoService;


    @RequestMapping(value = "/send")
    public void send(){
        User user = new User();
        user.setName("LiuMing");
        user.setGender(1);
        user.setBirthday(LocalDateTime.now());
        demoService.send(user);
    }



    @RequestMapping(value = "/custom/send")
    public void customSend(){
        User user = new User();
        user.setName("Mike");
        user.setGender(0);
        user.setBirthday(LocalDateTime.now());
        demoService.sendMessage(user);
    }

}
