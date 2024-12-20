/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author T R U T H
 */
public class CheckingAccount extends Account {
    private static final double OVERDRAFT_LIMIT = 1000.0;

    public CheckingAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= -OVERDRAFT_LIMIT) {
            balance -= amount;
            System.out.println(amount + " withdrawn from checking account " + accountNumber);
        } else {
            System.out.println("Withdrawal failed. Overdraft limit of " + OVERDRAFT_LIMIT + " exceeded.");
        }
    }
}

