package com.kakfCons.demo;

import com.example.kafMsg.event.NonRetryableException;
import com.example.kafMsg.event.ProductCreateEvent;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@KafkaListener(topics = "product-topic")
public class KafkaConsumer {

    @KafkaHandler
    public void handle(ProductCreateEvent productCreateEvent) throws NonRetryableException {
        if(true)
            throw new RetryableException("Test");
        System.out.println("Received-->"+ productCreateEvent.getProductId());
    }



}

