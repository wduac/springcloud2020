package com.wduac.springcloud.service.impl;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @author wduac
 * @date 2021/2/21 - 23:12
 */

//不需要service注解了，因为是和rabbitmq打交道的
@EnableBinding(Source.class) //定义消息的推送管道
public class IMessageProviderImpl implements com.wduac.springcloud.service.IMessageProvider {

    @Resource
    private MessageChannel output;

    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        System.out.println("********serial: "+serial);
        return null;
    }
}
