package com.example.Zomato.LoadBalancer;

import feign.Feign;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.context.annotation.Bean;

@LoadBalancerClient(value = "Gpay")
public class LoadBalancer {
    @LoadBalanced
    @Bean
    public Feign.Builder FeignBuilder(){
        return new Feign.Builder();

    }
}
