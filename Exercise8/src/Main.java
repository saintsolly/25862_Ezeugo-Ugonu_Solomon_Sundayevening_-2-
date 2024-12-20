/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author T R U T H
 */
// Main.java (Test Class)
public class Main {
    public static void main(String[] args) {
        // Create instances of each payment method
        CreditCard creditCard = new CreditCard("TXN123", 100.0, "USD", "1234567890", "John Doe");
        DebitCard debitCard = new DebitCard("TXN124", 200.0, "USD", "0987654321", "Jane Smith");
        PayPal paypal = new PayPal("TXN125", 50.0, "USD", "jane.smith@paypal.com");

        // Create instances of SecurePayment for transaction validation
        SecurePayment creditCardValidator = new CreditCardSecure();
        SecurePayment debitCardValidator = new DebitCardSecure();
        SecurePayment paypalValidator = new PayPalSecure();

        // Display Payment Details
        creditCard.displayPaymentDetails();
        debitCard.displayPaymentDetails();
        paypal.displayPaymentDetails();

        // Process Payments
        creditCard.processPayment();
        debitCard.processPayment();
        paypal.processPayment();

        // Refunds
        creditCard.refund();
        debitCard.refund();
        paypal.refund();

        // Validate Transactions
        System.out.println("\nValidating transactions...");
        System.out.println("Credit Card Validation: " + creditCardValidator.validateTransaction());
        System.out.println("Debit Card Validation: " + debitCardValidator.validateTransaction());
        System.out.println("PayPal Validation: " + paypalValidator.validateTransaction());
    }
}

