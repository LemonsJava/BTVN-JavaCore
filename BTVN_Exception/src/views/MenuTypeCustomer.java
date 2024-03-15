package views;

import utils.TypeCustomer;
import utils.MenuCustomer;
import java.util.Scanner;

public class MenuTypeCustomer {

    public void menu(){
        System.out.println("Moi chon loai khach hang:");
        System.out.println("1. Khach hang ca nhan");
        System.out.println("2. Khach hang doanh nghiep");
    }
    public TypeCustomer selectTypeCustomer(Scanner scanner) {
        while (true) {
            menu();
            int choice;
            do {
                try {
                    choice  = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.print("Lua chon khong hop le! Vui long nhap so tuong ung: ");
                }
            } while (true);
            switch (choice) {
                case MenuCustomer.INDIVIDUAL:
                    return TypeCustomer.INDIVIDUAL;
                case MenuCustomer.COMPANY:
                    return TypeCustomer.COMPANY;
                default:
                    System.out.println("Lua chon khong hop le! Vui long nhap lai: ");
                    break;
            }
        }
    }
}
