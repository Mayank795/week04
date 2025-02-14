package Collectionframework.shoppingcart;
import java.util.*;
class ShoppingCart {
    private Map<String, Double> productPrices = new HashMap<>(); // Product -> Price
    private LinkedHashMap<String, Integer> cart = new LinkedHashMap<>(); // Maintains order
    private TreeMap<Double, String> sortedProducts = new TreeMap<>(); // Sorts by price

    // Add a product with price
    public void addProduct(String product, double price) {
        productPrices.put(product, price);
        sortedProducts.put(price, product);
    }

    // Add item to cart
    public void addToCart(String product, int quantity) {
        if (!productPrices.containsKey(product)) {
            System.out.println(" Product not found!");
            return;
        }
        cart.put(product, cart.getOrDefault(product, 0) + quantity);
    }

    // Display cart in insertion order
    public void displayCart() {
        System.out.println("\n Shopping Cart (Insertion Order):");
        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue() + " units");
        }
    }

    // Display products sorted by price
    public void displaySortedProducts() {
        System.out.println("\n Products Sorted by Price:");
        for (Map.Entry<Double, String> entry : sortedProducts.entrySet()) {
            System.out.println(entry.getValue() + " -> $" + entry.getKey());
        }
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addProduct("Laptop", 1200.0);
        cart.addProduct("Phone", 800.0);
        cart.addProduct("Headphones", 150.0);
        cart.addProduct("Mouse", 50.0);

        cart.addToCart("Laptop", 1);
        cart.addToCart("Phone", 2);
        cart.addToCart("Mouse", 3);

        cart.displayCart();
        cart.displaySortedProducts();
    }
}
