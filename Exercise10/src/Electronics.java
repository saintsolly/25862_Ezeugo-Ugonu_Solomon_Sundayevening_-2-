/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author T R U T H
 */
// Electronics class
public class Electronics extends Product implements Returnable {
    private int warrantyPeriod;

    public Electronics(String productName, double price, String category, int warrantyPeriod) {
        super(productName, price, category);
        this.warrantyPeriod = warrantyPeriod;
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
        return warrantyPeriod > 6; // Eligible for return if warranty is greater than 6 months.
    }
}

