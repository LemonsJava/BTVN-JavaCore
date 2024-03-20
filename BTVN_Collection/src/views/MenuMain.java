package views;

import entities.Bill;
import entities.Customer;
import entities.Service;
import services.BillService;
import services.CustomerService;

import java.util.List;
import java.util.Scanner;

public class MenuMain {

    private final CustomerService customerService = new CustomerService();
    private final BillService billService = new BillService();
    public void showMenuMain() {
        System.out.println("======= MENU =======");
        System.out.println("1. Nhap danh sach khach hang");
        System.out.println("2. In danh sach khach hang");
        System.out.println("3. Nhap danh sach dich vu");
        System.out.println("4. In danh sach dich vu");
        System.out.println("5. Nhap hoa don");
        System.out.println("6. Sap xep danh sach hoa don theo ten");
        System.out.println("7. Sap xep danh sach hoa don so luot su dung (giam dan)");
        System.out.println("8. In hoa don");
        System.out.println("9.Thoat");
    }

    public void runMenuMain(Scanner scanner, List<Customer> customers, List<Service> services, List<Bill> bills) {
        while (true) {
            showMenuMain();
            System.out.println("Moi nhap lua chon: ");
            int option = 0;
            while (true) {
                try {
                    option = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Vui long nhap lai lua chon! ");
                }
            }
            switch (option) {
                case 1:
                    customerService.createListCustomer(scanner, customers);
                    break;
                case 2:
                    customerService.showListCustomer(customers);
                    break;
                case 3:
                    billService.createListService(scanner, services);
                    break;
                case 4:
                    billService.showListService(services);
                    break;
                case 5:
                    Bill bill = billService.createBill(scanner, customers, services);
                    bills.add(bill);
                    break;
                case 6:
                    billService.sortByLastname(bills);
                    break;
                case 7:
                    billService.sortByNumsService(bills);
                    break;
                case 8:
                    billService.calMoney(scanner, bills);
                    break;
                case 9:
                    return;
                default:
                    System.out.println("Vui long nhap lai!!! ");
            }
        }
    }
}
