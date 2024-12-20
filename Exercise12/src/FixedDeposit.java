/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author T R U T H
 */
public class FixedDeposit extends Account implements LoanEligible {
    private static final double MINIMUM_DEPOSIT_PERIOD = 12; // in months
    private static final double LOAN_ELIGIBILITY_PERCENTAGE = 50.0; // % of balance
    private int depositPeriod; // in months
    private boolean loanApproved = false;

    public FixedDeposit(String accountNumber, String holderName, double balance, int depositPeriod) {
        super(accountNumber, holderName, balance);
        this.depositPeriod = depositPeriod;
    }

    @Override
    public void withdraw(double amount) {
        if (depositPeriod < MINIMUM_DEPOSIT_PERIOD) {
            System.out.println("Withdrawal not allowed. Deposit period is less than " + MINIMUM_DEPOSIT_PERIOD + " months.");
        } else {
            balance -= amount;
            System.out.println(amount + " withdrawn from fixed deposit account " + accountNumber);
        }
    }

    @Override
    public void applyForLoan(double amount) {
        if (amount <= balance * (LOAN_ELIGIBILITY_PERCENTAGE / 100)) {
            loanApproved = true;
            System.out.println("Loan of " + amount + " approved for account " + accountNumber);
        } else {
            System.out.println("Loan application rejected. Amount exceeds " + LOAN_ELIGIBILITY_PERCENTAGE + "% of balance.");
        }
    }

    @Override
    public String checkLoanStatus() {
        return loanApproved ? "Loan approved." : "No loan approved.";
    }
}

