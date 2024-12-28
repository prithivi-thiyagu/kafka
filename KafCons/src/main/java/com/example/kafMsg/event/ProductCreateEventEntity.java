package com.example.kafMsg.event;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.io.Serializable;

@Entity(name = "products")
public class ProductCreateEventEntity implements Serializable {

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false,unique = true)
    private String messageId;
    @Column(nullable = false)
    private String productId;
    @Column
    private String title;
    @Column
    private int quantity;
    @Column
    private double price;

    public long getId() {
        return id;
    }

    public ProductCreateEventEntity(long id, String messageId, String productId, String title, int quantity, double price) {
        this.id = id;
        this.messageId = messageId;
        this.productId = productId;
        this.title = title;
        this.quantity = quantity;
        this.price = price;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public ProductCreateEventEntity() {
    }

    public ProductCreateEventEntity(String productId, String title, int quantity, double price) {
        this.productId = productId;
        this.title = title;
        this.quantity = quantity;
        this.price = price;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
