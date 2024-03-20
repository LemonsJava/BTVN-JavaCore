package views;

import utils.CustomerType;

import java.util.Scanner;

public class MenuCustomerType {
    public void showMenuCustomerType() {
        System.out.println("Moi lua chon loai khach hang: ");
        System.out.println("1. Khach hang ca nhan");
        System.out.println("2. Khach hang dai dien don vi hanh chinh");
        System.out.println("3. Khach hang dai dien don vi kinh doanh");
    }

    public CustomerType selectCustomerType(Scanner scanner) {
        while (true) {
            showMenuCustomerType();
            System.out.println("Moi nhap lua chon: ");
            int option;
            while (true) {
                try {
                    option = Integer.parseInt(scanner.nextLine());
                    if(option > 0) break;
                } catch (NumberFormatException e) {
                    System.out.println("Vui long nhap lai: ");
                }
            }
            switch (option) {
                case 1:
                    return CustomerType.INDIVIDUAL;
                case 2:
                    return CustomerType.REPRESENTATIVE_OF_ADMINISTRATIVE_UNIT;
                case 3:
                    return CustomerType.REPRESENTATIVE_OF_BUSINESS_UNIT;
                default:
                    System.out.println("Lua chon khong hop le! Moi nhap lai");
                    break;
            }
        }
    }
}
