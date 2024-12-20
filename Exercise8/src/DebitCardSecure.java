/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author T R U T H
 */
// DebitCardSecure.java (Implements SecurePayment)
public class DebitCardSecure implements SecurePayment {

    @Override
    public boolean validateTransaction() {
        // Placeholder logic for validation
        System.out.println("Validating Debit Card transaction...");
        return true;  // Assume validation is successful
    }
}

