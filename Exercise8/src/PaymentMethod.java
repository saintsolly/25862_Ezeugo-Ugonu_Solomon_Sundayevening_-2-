/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author T R U T H
 */
// PaymentMethod.java (Abstract Class)
public abstract class PaymentMethod implements Transaction {
    private String transactionId;
    private double amount;
    private String currency;

    public PaymentMethod(String transactionId, double amount, String currency) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.currency = currency;
    }

    // Getters
    public String getTransactionId() {
        return transactionId;
    }

    public double getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    // Abstract method to display payment details
    public abstract void displayPaymentDetails();
}
