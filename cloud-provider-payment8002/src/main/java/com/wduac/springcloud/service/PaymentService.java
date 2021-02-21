package com.wduac.springcloud.service;

import com.wduac.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author wduac
 * @date 2021/2/17 - 23:32
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(Long id);

}
