package com.czd.demo.customize;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author admin
 */
public interface CustomizeSink {

    String CUSTOMIZE_SINK_INPUT = "customInput";


    /**
     * input
     *
     * @return
     */
    @Input(value = CUSTOMIZE_SINK_INPUT)
    SubscribableChannel input();
}
