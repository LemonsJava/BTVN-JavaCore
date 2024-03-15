package views;

import utils.Major;

import java.util.Scanner;

public class MenuMajor {
    private static final int TECH = 1;
    private static final int BUSINESS = 2;
    private static final int LANGUAGE = 3;
    public void menuMajor() {
        System.out.println("Moi chon chuyen nganh: ");
        System.out.println("1. TECH");
        System.out.println("2. BUSSINESS");
        System.out.println("3. LANGUAGE");
    }

    public Major selectMajor(Scanner scanner) {
        while (true) {
            menuMajor();
            int select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case TECH: {
                    return Major.TECH;
                }
                case BUSINESS: {
                    return Major.BUSINESS;
                }
                case LANGUAGE: {
                    return Major.LANGUAGE;
                }
                default:
                    System.out.println("Vui long nhap lai!");
                    break;
            }
        }
    }
}
