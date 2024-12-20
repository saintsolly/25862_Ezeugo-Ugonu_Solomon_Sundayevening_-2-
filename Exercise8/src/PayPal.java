/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author T R U T H
 */
// PayPal.java (Subclass of PaymentMethod)
public class PayPal extends PaymentMethod {
    private String paypalAccount;

    public PayPal(String transactionId, double amount, String currency, String paypalAccount) {
        super(transactionId, amount, currency);
        this.paypalAccount = paypalAccount;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing PayPal payment for: " + getAmount() + " " + getCurrency());
    }

    @Override
    public void refund() {
        System.out.println("Refunding PayPal payment for: " + getAmount() + " " + getCurrency());
    }

    @Override
    public void displayPaymentDetails() {
        System.out.println("PayPal Payment: ");
        System.out.println("Transaction ID: " + getTransactionId());
        System.out.println("Amount: " + getAmount() + " " + getCurrency());
        System.out.println("PayPal Account: " + paypalAccount);
    }
}

