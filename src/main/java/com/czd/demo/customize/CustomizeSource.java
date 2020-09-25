package com.czd.demo.customize;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * @author admin
 */
public interface CustomizeSource {

    String CUSTOMIZE_SOURCE_OUTPUT = "customOutput";


    /**
     * output
     *
     * @return
     */
    @Output(value = CUSTOMIZE_SOURCE_OUTPUT)
    MessageChannel output();
}
