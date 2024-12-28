package com.example.kafMsg;

import com.example.kafMsg.pojo.Product;

import java.util.concurrent.ExecutionException;

public interface ProductService {

    Product addProduct(Product product) throws ExecutionException, InterruptedException;

}
