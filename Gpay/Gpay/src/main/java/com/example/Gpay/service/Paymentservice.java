package com.example.Gpay.service;

import com.example.Gpay.entity.Payment;
import com.example.Gpay.repo.PaymentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class Paymentservice {
    @Autowired
    private PaymentRepo repo;
    public String payment(Payment payment) {
        Random x=new Random();
        int y=x.nextInt(1000,1000000);
        payment.setTransactionId(y);
        payment.setSuccess(true);
        System.out.println("Helloooo");
        repo.save(payment);
        return "success + TranscationId = "+y;




    }
}
