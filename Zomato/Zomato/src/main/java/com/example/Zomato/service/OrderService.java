package com.example.Zomato.service;

import com.example.Zomato.config.myFeignClient;
import com.example.Zomato.entity.OrderEntity;
import com.example.Zomato.repo.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class OrderService {
    @Autowired
    private  OrderRepo repo;
    @Autowired
    private WebClient web;
    @Autowired
    private myFeignClient fg;
    public  String order(OrderEntity order) {
        order.setOrderplaced(false);
        repo.save(order);
        OrderEntity o= new OrderEntity();
        o.setFood(order.getFood());
        o.setName(order.getName());
        o.setAmount(order.getAmount());
       // order.setId(0);
//        Mono<String> x=web.post().uri("/payment").bodyValue(o).retrieve().bodyToMono(String.class);
          String x=fg.payment(o);

        if(x.startsWith("success")){
            order.setOrderplaced(true);
            repo.save(order);
            return "Order Placed";
        }
        return "order not placed";

    }

}
