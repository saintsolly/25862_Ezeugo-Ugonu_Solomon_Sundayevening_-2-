/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author T R U T H
 */
public class BankingApplication {
    public static void main(String[] args) {
        // Create accounts
        SavingsAccount savingsAccount = new SavingsAccount("S12345", "John Doe", 1000);
        CheckingAccount checkingAccount = new CheckingAccount("C12345", "Jane Doe", 500);
        FixedDeposit fixedDeposit = new FixedDeposit("F12345", "Bob Smith", 5000, 24);

        // Test SavingsAccount
        savingsAccount.deposit(500);
        savingsAccount.withdraw(800);
        savingsAccount.checkBalance();

        // Test CheckingAccount
        checkingAccount.deposit(300);
        checkingAccount.withdraw(1000);
        checkingAccount.withdraw(800); // Overdraft test
        checkingAccount.checkBalance();

        // Test FixedDeposit
        fixedDeposit.withdraw(1000); // Not allowed if deposit period is less than 12 months
        fixedDeposit.applyForLoan(2000); // Loan eligibility test
        System.out.println(fixedDeposit.checkLoanStatus());
        fixedDeposit.checkBalance();
    }
}

