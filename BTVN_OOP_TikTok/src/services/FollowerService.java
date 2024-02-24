package services;

import entities.Followers;

import java.util.ArrayList;
import java.util.Scanner;

public class FollowerService {


    public Followers inputFollowers(Scanner scanner){
            System.out.println("Nhap ten nguoi theo doi:");
            String nameFl = scanner.nextLine();
            System.out.println("Nhap ID cua nguoi theo doi:");
            int id = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhap email cua nguoi theo doi:");
            String email = scanner.nextLine();
            System.out.println("Nhap so luot thich:");
            int numOfLike = Integer.parseInt(scanner.nextLine());
            return new Followers(nameFl, id, email, numOfLike);
    }

    public void saveFollowers(Scanner scanner, ArrayList<Followers> followers) {
        System.out.println("Moi nhap so luong nguoi theo doi:");
        int n = Integer.parseInt(scanner.nextLine());
        if (n == 0) {
            System.out.println("Chua co ai theo doi idol nay !");
        }
        else {
            for (int i = 0; i < n; i++) {
                System.out.println("Nhap thong tin nguoi theo doi thu " +(i+1)+ " :");
                Followers follower = inputFollowers(scanner);
                followers.add(follower);
            }
        }
    }


}
