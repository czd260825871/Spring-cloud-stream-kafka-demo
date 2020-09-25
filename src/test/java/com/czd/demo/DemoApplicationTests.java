package com.czd.demo;

import com.czd.demo.entity.User;
import com.czd.demo.service.DemoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.time.LocalDateTime;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private DemoService demoService;

    @Test
    public void send(){
        User user = new User();
        user.setName("LiuMing");
        user.setGender(1);
        user.setBirthday(LocalDateTime.now());
        demoService.send(user);
    }
}
