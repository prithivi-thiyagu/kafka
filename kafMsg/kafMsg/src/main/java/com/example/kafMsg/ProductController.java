package com.example.kafMsg;

import com.example.kafMsg.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;
    @PostMapping("/addProd")
    public ResponseEntity<Product> addProduct(@RequestBody Product product) throws ExecutionException, InterruptedException {
       Product product1 = productService.addProduct(product);
        return ResponseEntity.ok(product1);
    }
}
