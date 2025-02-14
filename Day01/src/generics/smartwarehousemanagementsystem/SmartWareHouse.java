package com.generics.smartwarehousemanagementsystem;

public class SmartWareHouse {
    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop", 1200));
        electronicsStorage.addItem(new Electronics("Smartphone", 800));

        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("Apple", 1.5));
        groceriesStorage.addItem(new Groceries("Milk", 2.0));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair", 50));
        furnitureStorage.addItem(new Furniture("Table", 150));

        System.out.println("Electronics:");
        WarehouseUtil.displayItems(electronicsStorage.getItems());

        System.out.println("\nGroceries:");
        WarehouseUtil.displayItems(groceriesStorage.getItems());

        System.out.println("\nFurniture:");
        WarehouseUtil.displayItems(furnitureStorage.getItems());
    }
}
