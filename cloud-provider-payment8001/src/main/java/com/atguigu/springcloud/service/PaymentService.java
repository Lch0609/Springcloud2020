package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Classname PaymentService
 * @Description TODO
 * @Date 2020/3/10 22:21
 * @Created by 李传豪
 * @Version 1.0
 */
public interface PaymentService {
    public int create(Payment payment);
    public Payment getPaymentById(@Param("id")Long id);
}
