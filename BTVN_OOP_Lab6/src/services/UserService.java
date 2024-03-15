package services;

import entities.Student;
import entities.Teacher;
import entities.User;
import utils.Major;
import utils.Role;
import views.MenuMajor;

import java.util.ArrayList;
import java.util.Scanner;

public class UserService {
    public User createUser(Scanner scanner, Role role) {
        System.out.println("Moi nhap username: ");
        String name = scanner.nextLine();
        System.out.println("Moi nhap password: ");
        String password = scanner.nextLine();
        System.out.println("Moi nhap email: ");
        String email = scanner.nextLine();
        System.out.println("Moi nhap sdt: ");
        int phone = Integer.parseInt(scanner.nextLine());
        System.out.println("Moi nhap dia chi: ");
        String address = scanner.nextLine();
        if (role == Role.TEACHER) {
            MenuMajor menuMajor = new MenuMajor();
            Major major = menuMajor.selectMajor(scanner);
            return new Teacher(name, password, email, address, phone, role, major, 0);
        } else if (role == Role.STUDENT) {
            System.out.println("Moi nhap diem trung binh: ");
            double avgScore = Double.parseDouble(scanner.nextLine());
            return new Student(name, password, email, address, phone, role, avgScore, 0);
        }
        else return null;
    }
}

