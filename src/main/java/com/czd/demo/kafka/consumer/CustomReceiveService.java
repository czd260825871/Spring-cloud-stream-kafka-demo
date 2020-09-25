package com.czd.demo.kafka.consumer;

import com.alibaba.fastjson.JSON;
import com.czd.demo.customize.CustomizeSink;
import com.czd.demo.entity.User;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;

/**
 * @author admin
 */
@EnableBinding(CustomizeSink.class)
public class CustomReceiveService {
    

    @StreamListener(CustomizeSink.CUSTOMIZE_SINK_INPUT)
    public void receiveMessage(Message<User> userMessage){
        User user = userMessage.getPayload();
        System.out.println(JSON.toJSONString(user));
    }
}
