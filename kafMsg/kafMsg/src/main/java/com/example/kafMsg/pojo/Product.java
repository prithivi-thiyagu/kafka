package com.example.kafMsg.pojo;

public class Product {

    private String title;
    private int quantity;
    private double price;

    public Product() {
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



    public Product(String title, int quantity, double price) {
        this.title = title;
        this.quantity = quantity;
        this.price = price;
    }
}
