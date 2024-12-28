package com.example.kafMsg.event;

public class ProductCreateEvent {

    private String productId;
    private String title;
    private int quantity;
    private double price;

    public ProductCreateEvent() {
    }

    public ProductCreateEvent(String productId, String title, int quantity, double price) {
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
