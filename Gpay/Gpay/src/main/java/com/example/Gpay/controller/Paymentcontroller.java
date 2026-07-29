package com.example.Gpay.controller;

import com.example.Gpay.entity.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.Gpay.service.Paymentservice;

@RestController
public class Paymentcontroller {
    @Autowired
    private Paymentservice service;

    @PostMapping("/payment")
    public String payment(@RequestBody Payment payment){
        return service.payment(payment);

    }


}
