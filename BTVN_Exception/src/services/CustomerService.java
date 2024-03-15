package services;

import Exceptions.InvalidCustomerException;
import entities.Customer;
import entities.SavingAccount;
import utils.TypeCustomer;
import views.MenuTypeCustomer;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerService {
    public void createCustomer(Scanner scanner, ArrayList<Customer> customers) throws InvalidCustomerException {
        System.out.print("Moi nhap ho va ten: ");
        String name = scanner.nextLine();
        System.out.print("Moi nhap dia chi: ");
        String address = scanner.nextLine();
        System.out.print("Moi nhap sdt: ");
        String phoneNumber = scanner.nextLine();
        MenuTypeCustomer menuTypeCustomer = new MenuTypeCustomer();
        TypeCustomer typeCustomer = menuTypeCustomer.selectTypeCustomer(scanner);
        customers.add(new Customer(name, address, phoneNumber, typeCustomer));
        //return new Customer(name, address, phoneNumber, typeCustomer);
    }
    public Customer findByName(String name, ArrayList<Customer> customers) {
        for(Customer customer : customers) {
            if(customer.getName().equalsIgnoreCase(name)) {
                return customer;
            }
        }
        return null;
    }

    public void displaySavingsOfCustomer(Scanner scanner, ArrayList<Customer> customers) {
        double sum = 0;
        if (customers.isEmpty()) {
            System.out.println("Danh sach khach hang rong !!!");
        }
        else {
            System.out.println("Moi nhap ten khach hang can tim: ");
            String name = scanner.nextLine();
            Customer customer = findByName(name, customers);
            for(SavingAccount saving : customer.getSavingAccounts()) {
                System.out.println("Ban da gui so tien: " + saving.getBalance() + " - Tai ngan hang: " + saving.getBank().getName());
                sum += saving.getBalance();
            }
            System.out.println("Tong so tien da gui la: " + sum);
        }
    }
}
