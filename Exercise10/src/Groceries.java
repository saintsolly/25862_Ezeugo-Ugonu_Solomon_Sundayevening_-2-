/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author T R U T H
 */
// Groceries class
public class Groceries extends Product implements Returnable {
    private String expiryDate;

    public Groceries(String productName, double price, String category, String expiryDate) {
        super(productName, price, category);
        this.expiryDate = expiryDate;
    }

    @Override
    public void applyDiscount(double discountPercentage) {
        // No discount allowed on groceries
        System.out.println("No discounts available for groceries.");
    }

    @Override
    public double calculateFinalPrice() {
        return price; // No discount applied
    }

    @Override
    public boolean isEligibleForReturn() {
        return false; // Groceries are not returnable after purchase
    }
}
