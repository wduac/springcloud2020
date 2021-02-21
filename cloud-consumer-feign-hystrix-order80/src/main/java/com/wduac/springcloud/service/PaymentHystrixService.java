package com.wduac.springcloud.service;

import com.wduac.springcloud.entities.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.websocket.server.ServerEndpoint;

/**
 * @author wduac
 * @date 2021/2/20 - 13:36
 */

@Service
@FeignClient(value = "CLOUD-PROVIDER-HYSTRIX-PAYMENT", fallback = PaymentFallbackService.class)
public interface PaymentHystrixService {

    @GetMapping(value="/payment/hystrix/ok/{id}")
    public String getPaymentById(@PathVariable("id") Long id);

    @GetMapping("/payment/hystrix/timeout{id}")
    public String paymentFeignTimeout(Integer id);
}
