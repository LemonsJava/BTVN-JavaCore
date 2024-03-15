package views;

import java.util.ArrayList;
import java.util.Scanner;

import Exceptions.InvalidBankException;
import Exceptions.InvalidCustomerException;
import Exceptions.InvalidSAvingAccountException;
import Exceptions.MaxSavingsAccountException;
import entities.Bank;
import entities.Customer;
import entities.SavingAccount;
import services.BankService;
import services.CustomerService;
import services.SavingAccoutService;
import utils.MenuSeeMain;

public class MenuMain {
    public void menuMain() {
        System.out.println("========== MENU ==========");
        System.out.println("1. Them khach hang moi");
        System.out.println("2. Them mot ngan hang moi");
        System.out.println("3. Them mot so tiet kiem moi");
        System.out.println("4. Xem danh sach khach hang");
        System.out.println("5. Xem danh sach ngan hang");
        System.out.println("6. Xem danh sach so tiet kiem theo ten khach hang");
        System.out.println("7. Xem danh sach so tiet kiem theo so tien da gui");
        System.out.println("8. Thoat chuong trinh");
    }

    public void run(Scanner scanner, ArrayList<Customer> customers, ArrayList<Bank> banks, ArrayList<SavingAccount> savingAccounts) throws InvalidCustomerException, InvalidBankException, MaxSavingsAccountException, InvalidSAvingAccountException {
        SavingAccoutService savingAccoutService = new SavingAccoutService();
        CustomerService customerService = new CustomerService();
        boolean isRunning = true;
        while (isRunning) {
            menuMain();
            System.out.println("Moi chon chuc nang: ");
            int choice;
            do {
                try {
                    choice  = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.print("Lua chon khong hop le! Vui long nhap so: ");
                }
            } while (true);
            switch (choice) {
                case MenuSeeMain.CREATE_NEW_CUSTOMER:
                    customerService.createCustomer(scanner, customers);
                    for(Customer customer : customers)
                        System.out.println(customers);
                    break;
                case MenuSeeMain.CREATE_NEW_BANK:
                    BankService bankService = new BankService();
                    bankService.createBank(scanner, banks);
                    break;
                case MenuSeeMain.CREATE_NEW_SAVING_ACCOUNT:
                    if(customers.isEmpty() || banks.isEmpty()) {
                        System.out.println("Khong the tao so tiet kiem!!!");
                    }
                    else {
                        savingAccoutService.createSavingAccount(scanner, customers, banks, savingAccounts);
                    }
                    break;
                case MenuSeeMain.DISPLAY_CUSTOMERS:
                    if (customers.isEmpty()) {
                        System.out.println("Danh sach khach hang rong!");
                        break;
                    }
                    for (Customer customer : customers) {
                        System.out.println(customer);
                    }
                    break;
                case MenuSeeMain.DISPLAY_BANKS:
                    if (banks.isEmpty()) {
                        System.out.println("Danh sach ngan hang rong!");
                        break;
                    }
                    for (Bank bank : banks) {
                        System.out.println(bank);
                    }
                    break;
                case MenuSeeMain.DISPLAY_SAVING_ACCOUNTS_BY_NAME:
                    if(savingAccounts.isEmpty()) {
                        System.out.println("Danh sach so tiet kiem rong!");
                        break;
                    }
                    savingAccoutService.sortByNameCustomer(savingAccounts);
                    break;
                case MenuSeeMain.DISPLAY_SAVING_ACCOUNTS_BY_BALANCE:
                    if(savingAccounts.isEmpty()) {
                        System.out.println("Danh sach so tiet kiem rong!");
                        break;
                    }
                    savingAccoutService.sortByBalance(savingAccounts);
                    break;
                case MenuSeeMain.DISPLAY_ALL_SAVINGS_OF_CUSTOMER:
                    customerService.displaySavingsOfCustomer(scanner, customers);
                case MenuSeeMain.EXIT:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
                    break;
            }
        }
    }

}
