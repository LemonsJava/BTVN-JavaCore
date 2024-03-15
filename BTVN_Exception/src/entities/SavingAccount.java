package entities;

import Exceptions.InvalidSAvingAccountException;
import Exceptions.MaxSavingsAccountException;

public class SavingAccount {
    private Customer customer;
    private Bank bank;
    private double balance;

    public SavingAccount(Customer customer, Bank bank, double balance) throws InvalidSAvingAccountException, MaxSavingsAccountException {
        if (customer == null || bank == null || balance < 0) {
            throw new InvalidSAvingAccountException("Invalid saving details");
        }
        this.customer = customer;
        this.bank = bank;
        this.balance = balance;
        //customer.addSavingsAccount(this);
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "SavingAccount{" +
               // "customer=" + customer +
                ", bank=" + bank +
                ", balance=" + balance +
                '}';
    }
}
