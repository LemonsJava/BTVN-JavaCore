package entities;

import Exceptions.InvalidBankException;

public class Bank {
    private static int autoId = 0;
    private String id;
    private String name;
    private double interestRate;

    public Bank(String name, double interestRate) throws InvalidBankException {
        if(name == null || name.isEmpty() || interestRate < 0){
            throw new InvalidBankException("Invalid bank details");
        }
        this.id = String.format("%03d", ++autoId);
        this.name = name;
        this.interestRate = interestRate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", interestRate=" + interestRate +
                '}';
    }
}
