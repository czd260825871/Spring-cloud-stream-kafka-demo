package com.czd.demo.kafka.producer;

import com.alibaba.fastjson.JSON;
import com.czd.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;



/**
 * @author admin
 */
@EnableBinding(Source.class)
public class SendService {

    @Autowired
    private Source source;


    public void send(User user){
        String msg = JSON.toJSONString(user);
        source.output().send(MessageBuilder.withPayload(msg).build());
    }
}
