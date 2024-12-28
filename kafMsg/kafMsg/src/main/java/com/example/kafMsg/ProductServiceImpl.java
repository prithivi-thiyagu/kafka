package com.example.kafMsg;

import com.example.kafMsg.event.ProductCreateEvent;
import com.example.kafMsg.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    KafkaTemplate<String,ProductCreateEvent> kafkaTemplate;
    @Override
    public Product addProduct(Product product) throws ExecutionException, InterruptedException {

        String id = UUID.randomUUID().toString();

        ProductCreateEvent productCreateEvent = new ProductCreateEvent("id", product.getTitle(), product.getQuantity(), product.getPrice());
        SendResult<String,ProductCreateEvent> future = kafkaTemplate.send("product-topic","id",productCreateEvent).get();

        return product;

    }
}
