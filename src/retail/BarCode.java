package ru.retail;

public class BarCode {

    private String id;
    private float price;

    public BarCode(String id, float price){
        this.id = id;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public float getPrice() {
        return price;
    }
}
