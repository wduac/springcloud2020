package com.wduac.springcloud.controller;

import com.wduac.springcloud.service.IMessageProvider;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author wduac
 * @date 2021/2/21 - 23:21
 */


@RestController
public class SendMessageController {

    @Resource
    private IMessageProvider iMessageProvider;

    @GetMapping("/sendMessage")
    public String send(){
        return iMessageProvider.send();
    }
}
