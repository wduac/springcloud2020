package com.wduac.springcloud.service.impl;

import com.wduac.springcloud.dao.PaymentDao;
import com.wduac.springcloud.entities.Payment;
import com.wduac.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author wduac
 * @date 2021/2/17 - 23:33
 */
@Service
public class PaymentServiceImpl implements PaymentService
{
    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment){
      return paymentDao.create(payment);
    };

    public Payment getPaymentById(Long id){
       return paymentDao.getPaymentById(id);
    };
}
