package com.generics.smartwarehousemanagementsystem;

abstract  public class WarehouseItem {
    private String name;
    private double price;

    public WarehouseItem(String name,double price){
        this.name=name;
        this.price=price;
    }
    public String getName(){
        return name;
    }
    public double getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}


