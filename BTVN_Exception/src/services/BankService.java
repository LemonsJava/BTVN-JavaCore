package services;

import Exceptions.InvalidBankException;
import entities.Bank;

import java.util.ArrayList;
import java.util.Scanner;

public class BankService {
    public Bank createBank(Scanner scanner, ArrayList<Bank> banks) throws InvalidBankException {
        String name;
        double interestRate = 0;
        Bank bank;
        // Check if the bank name is already in use
        do {
            System.out.println("Moi nhap ten ngan hang: ");
            name = scanner.nextLine();
            bank = findByName(name, banks);
            if (bank != null) {
                System.out.println("Ten ngan hang da ton tai!");
            }
        }
        while (bank != null);
        // Prompt for interest rate
        do {
            try {
                System.out.print("Moi nhap lai suat (%/nam): ");
                interestRate = Double.parseDouble(scanner.nextLine());
                if (interestRate > 0) break;
                else System.out.println("Lai suat phai lon hon 0!");
            } catch (NumberFormatException e) {
                System.out.println("Vui long nhap so!!");
            }
        } while (true);
        banks.add(new Bank(name, interestRate));
        return new Bank(name, interestRate);
    }
    public Bank findByName(String name, ArrayList<Bank> banks) {
        for(Bank bank : banks) {
            if(bank.getName().equalsIgnoreCase(name)) {
                return bank;
            }
        }
        return null;
    }
}
