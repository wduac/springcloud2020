package com.wduac.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author wduac
 * @date 2021/2/20 - 15:41
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String getPaymentById(Long id) {
        return "------PaymentFallbackService fall back, (灬ꈍ ꈍ灬)";
    }

    @Override
    public String paymentFeignTimeout(Integer id) {
        return "------PaymentFallbackService timeout, (灬ꈍ ꈍ灬)";
    }
}
