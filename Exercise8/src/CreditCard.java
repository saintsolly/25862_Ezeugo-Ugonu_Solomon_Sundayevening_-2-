/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author T R U T H
 */
// CreditCard.java (Subclass of PaymentMethod)
public class CreditCard extends PaymentMethod {
    private String cardNumber;
    private String cardHolder;

    public CreditCard(String transactionId, double amount, String currency, String cardNumber, String cardHolder) {
        super(transactionId, amount, currency);
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing Credit Card payment for: " + getAmount() + " " + getCurrency());
    }

    @Override
    public void refund() {
        System.out.println("Refunding Credit Card payment for: " + getAmount() + " " + getCurrency());
    }

    @Override
    public void displayPaymentDetails() {
        System.out.println("Credit Card Payment: ");
        System.out.println("Transaction ID: " + getTransactionId());
        System.out.println("Amount: " + getAmount() + " " + getCurrency());
        System.out.println("Card Number: " + cardNumber);
        System.out.println("Card Holder: " + cardHolder);
    }
}

