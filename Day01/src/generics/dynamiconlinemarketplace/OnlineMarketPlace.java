package com.generics.dynamiconlinemarketplace;

public class OnlineMarketPlace {
    public static void main(String[] args) {
        // Create a catalog for books
        ProductCatalog<Product<BookCategory>> bookCatalog = new ProductCatalog<>();
        bookCatalog.addProduct(new Product<>("The Alchemist", 15.99, BookCategory.FICTION));
        bookCatalog.addProduct(new Product<>("A Brief History of Time", 20.99, BookCategory.SCIENCE));

        // Create a catalog for clothing
        ProductCatalog<Product<ClothingCategory>> clothingCatalog = new ProductCatalog<>();
        clothingCatalog.addProduct(new Product<>("T-Shirt", 9.99, ClothingCategory.MEN));
        clothingCatalog.addProduct(new Product<>("Dress", 29.99, ClothingCategory.WOMEN));

        // Create a catalog for gadgets
        ProductCatalog<Product<GadgetCategory>> gadgetCatalog = new ProductCatalog<>();
        gadgetCatalog.addProduct(new Product<>("Smartphone", 699.99, GadgetCategory.SMARTPHONES));
        gadgetCatalog.addProduct(new Product<>("Laptop", 1299.99, GadgetCategory.LAPTOPS));

        // Display all catalogs
        System.out.println(" Book Catalog:");
        bookCatalog.displayCatalog();

        System.out.println("\n Clothing Catalog:");
        clothingCatalog.displayCatalog();

        System.out.println("\n Gadget Catalog:");
        gadgetCatalog.displayCatalog();

        // Apply a discount to a book
        System.out.println("\nApplying Discount...");
        DiscountUtil.applyDiscount(bookCatalog.getProducts().get(0), 10); // 10% off on the first book

        // Display updated catalog
        System.out.println("\n Updated Book Catalog:");
        bookCatalog.displayCatalog();
    }
}
