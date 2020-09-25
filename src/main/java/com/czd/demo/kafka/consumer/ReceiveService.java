package com.czd.demo.kafka.consumer;

import com.alibaba.fastjson.JSON;
import com.czd.demo.entity.User;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;

/**
 * @author admin
 */
@EnableBinding(Sink.class)
public class ReceiveService {


    /**
     * 可以用User、String、Message<User>
     * @param message
     */
    @StreamListener(Sink.INPUT)
    public void receive(Message<User> message){
        User user = message.getPayload();
        System.out.println(JSON.toJSONString(user));
    }
}
