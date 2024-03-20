package services;

import entities.Customer;
import utils.CustomerType;
import views.MenuCustomerType;

import java.util.List;
import java.util.Scanner;

public class CustomerService {
    //private final List<Customer> customers = new ArrayList<>();

    public Customer createCustomer(Scanner scanner) {
        MenuCustomerType menuCustomerType = new MenuCustomerType();
        System.out.println("Nhap ho va ten khach hang: ");
        String name = scanner.nextLine();
        System.out.println("Nhap dia chi khach hang: ");
        String address = scanner.nextLine();
        System.out.println("Nhap SDT khach hang: ");
        String phone = scanner.nextLine();
        CustomerType customerType = menuCustomerType.selectCustomerType(scanner);
        return new Customer(name, address, phone, customerType);
    }

    public void createListCustomer(Scanner scanner, List<Customer> customers) {
        System.out.println("Nhap so luong khach hang: ");
        int count;
        while (true) {
            try {
                count = Integer.parseInt(scanner.nextLine());
                if(count > 0) break;
                System.out.println("So luong khach hang > 0.");
            } catch (NumberFormatException e) {
                System.out.println("Vui long nhap lai so luong khach hang!");
            }
        }
        for (int i = 0; i < count; i++) {
            System.out.println("Nhap thong tin khach hanh thu " + (i+1) + " :");
            customers.add(createCustomer(scanner));
        }
    }

    public void showListCustomer(List<Customer> customers) {
        if(!customers.isEmpty()) {
            for (Customer customer : customers) {
                System.out.println(customer);
            }
        }
        else {
            System.out.println("Danh sach khach hang rong!");
        }
    }

    public Customer findCustomerById(Scanner scanner, List<Customer> customers) {
        if (!customers.isEmpty()) {
            System.out.println("Nhap ID khach hang: ");
            int id;
            while (true) {
                while (true) {
                    try {
                        id = Integer.parseInt(scanner.nextLine());
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Vui long nhap lai ID!");
                    }
                }
                for (Customer customer : customers) {
                    if (customer.getId().equals(String.format("%05d", id))) {
                        return customer;
                    }
                }
                System.out.println("Khong tim thay khach hang co ID " + id + ". Vui long nhap lai: ");
            }
        }
        else {
            System.out.println("Danh sach khach hang rong!");
            return null;
        }
    }
}
