/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author T R U T H
 */
// Clothing class
public class Clothing extends Product implements Returnable {
    private String size;

    public Clothing(String productName, double price, String category, String size) {
        super(productName, price, category);
        this.size = size;
    }

    @Override
    public void applyDiscount(double discountPercentage) {
        price = price - (price * discountPercentage / 100);
    }

    @Override
    public double calculateFinalPrice() {
        return price;
    }

    @Override
    public boolean isEligibleForReturn() {
        return true; // All clothing items are eligible for return within a 30-day period.
    }
}
