package services;

import entities.Followers;
import entities.Idols;

import java.util.ArrayList;
import java.util.Scanner;

public class IdolService {
    public Idols inputIdol(Scanner scanner) {
        System.out.println("Nhap ten nguoi noi tieng:");
        String name = scanner.nextLine();
        System.out.println("Nhap ID cua nguoi noi tieng:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap email cua nguoi noi tieng:");
        String email = scanner.nextLine();
        System.out.println("Nhap ten nhom cua nguoi noi tieng:");
        String group = scanner.nextLine();
        System.out.println("Nhap thong tin nhung nguoi theo doi idol:");
        FollowerService followerService = new FollowerService();
        ArrayList<Followers> followers = new ArrayList<>();
        followerService.saveFollowers(scanner,followers);
        return new Idols(name, id, email,group, followers);
    }

    public void saveIdols(Scanner scanner, ArrayList<Idols> lstIdols) {
        System.out.println("Moi nhap so luong nguoi noi tieng:");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin nguoi noi tieng thu " + (i + 1) + " :");
            Idols idol = inputIdol(scanner);
            lstIdols.add(idol);
        }
        System.out.println(lstIdols);
    }

}
