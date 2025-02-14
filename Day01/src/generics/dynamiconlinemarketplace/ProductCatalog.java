package com.generics.dynamiconlinemarketplace;


// Generic class to manage product catalog
import java.util.ArrayList;
import java.util.List;

class ProductCatalog<T extends Product<?>> {
    private List<T> products = new ArrayList<>();
    public void addProduct(T product) {
        products.add(product);
    }

    public List<T> getProducts() {
        return products;
    }

    public void displayCatalog() {
        for (T product : products) {
            System.out.println(product);
        }
    }
}
