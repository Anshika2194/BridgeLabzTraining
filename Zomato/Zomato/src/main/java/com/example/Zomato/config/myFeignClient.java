package com.example.Zomato.config;

import com.example.Zomato.entity.OrderEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "Gpay")
public interface myFeignClient {
    @PostMapping("/payment")
    public String payment(@RequestBody OrderEntity order);
}
