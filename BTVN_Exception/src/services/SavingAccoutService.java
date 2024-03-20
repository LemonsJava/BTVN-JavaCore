package services;

import Exceptions.InvalidSAvingAccountException;
import Exceptions.MaxSavingsAccountException;
import entities.Bank;
import entities.Customer;
import entities.SavingAccount;

import java.util.*;

public class SavingAccoutService {
    public void createSavingAccount(Scanner scanner, ArrayList<Customer> customers, ArrayList<Bank> banks, ArrayList<SavingAccount> savingAccounts) throws MaxSavingsAccountException, InvalidSAvingAccountException {
        CustomerService customerService = new CustomerService();
        BankService bankService = new BankService();
        double balance = 0;
        Customer customer;
        Bank bank;
        do {
            System.out.println("Moi nhap ho va ten: ");
            String nameCustomer = scanner.nextLine();
            customer = customerService.findByName(nameCustomer, customers);
            if (customer == null) {
                System.out.println("Khong tim thay khach hang nao co ten " + nameCustomer + ". Vui long nhap lai!");
                continue;
            }
            do {
                System.out.println("Moi nhap ten ngan hang: ");
                String nameBank = scanner.nextLine();
                bank = bankService.findByName(nameBank, banks);
                if (bank == null) {
                    System.out.println("Khong tim thay ngan hang nao co ten " + nameBank + ". Vui long nhap lai!");
                    continue;
                }
                int count = 0;
            }
            while (bank == null);
            if (customer.getSavingAccounts().size() < 5 ) {
                do {
                    try {
                        System.out.print("Moi nhap so tien ban muon gui tiet kiem: ");
                        balance = Double.parseDouble(scanner.nextLine());
                        if (balance > 0) {
                            break;
                        } else {
                            System.out.println("So tien ban muon gui tiet kiem phai > 0");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Vui long nhap so!!!");
                    }
                } while (true);
                System.out.println("Ban da tao so tiet kiem thanh cong!");
                //customer.addSavingsAccount(new SavingAccount(customer, bank, balance));
                savingAccounts.add(new SavingAccount(customer, bank, balance));
            }
            else {
                System.out.println("Ban da tao toi da so tiet kiem!");
                break;
            }
        }
        while (customer == null);

        //return new SavingAccount(customer, bank, balance);
    }


    public void sortByNameCustomer(ArrayList<SavingAccount> savingAccounts){
        ArrayList<SavingAccount> result = savingAccounts;

        Collections.sort(result, new Comparator<SavingAccount>() {
            @Override
            public int compare(SavingAccount o1, SavingAccount o2) {
                return o1.getCustomer().getLastName().compareTo(o2.getCustomer().getLastName());
            }
        });
        for(SavingAccount c : result) {
            System.out.println(c);
        }
    }

    public void sortByBalance(ArrayList<SavingAccount> savingAccounts) {
        ArrayList<SavingAccount> result = savingAccounts;
        Collections.sort(result, new Comparator<SavingAccount>() {
            @Override
            public int compare(SavingAccount o1, SavingAccount o2) {
                return Double.compare(o1.getBalance(), o2.getBalance());
            }
        });
        for(SavingAccount s : result) {
            System.out.println(s);
        }
    }
}
