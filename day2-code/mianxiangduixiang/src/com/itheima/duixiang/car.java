package com.itheima.duixiang;

public class car {
    private String brand;
    private int price;
    private String color;
    public car(){}
    public car(String brand, int price, String color){
        this.brand = brand;
        this.price = price;
        this.color = color;
    }
    public String getBrand(){
        return brand;
    }
    public int getPrice(){
        return price;
    }
    public String getColor(){
        return color;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setPrice (int price){
        this.price = price;
    }
    public void setColor(String color){
        this.color = color;
    }
}
