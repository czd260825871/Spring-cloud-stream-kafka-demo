package com.czd.demo.kafka.producer;

import com.alibaba.fastjson.JSON;
import com.czd.demo.customize.CustomizeSource;
import com.czd.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.integration.support.MessageBuilder;

/**
 * @author admin
 */
@EnableBinding(CustomizeSource.class)
public class CustomSendService {

    @Autowired
    private CustomizeSource customizeSource;


    public void sendMessage(User user){
        String s = JSON.toJSONString(user);
        customizeSource.output().send(MessageBuilder.withPayload(s).build());
    }
}
