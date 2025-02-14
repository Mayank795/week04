package com.generics.dynamiconlinemarketplace;
class Product<T> {
    private String name;
    private double price;
    private T category;  // Category type (BookCategory, ClothingCategory, etc.)

    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public T getCategory() {
        return category;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + ", category=" + category + "}";
    }
}

