package views;

import entities.Student;
import entities.Teacher;
import entities.User;
import services.UserService;
import utils.Role;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuAdmin {
    private static final int CREATE_NEW_TEACHER = 1;
    private static final int CREATE_NEW_STUDENT = 2;
    private static final int EXIT = 3;
    UserService service = new UserService();

    public void menuAdmin() {
        System.out.println("========== MENU ==========");
        System.out.println("1. Them mot giao vien moi");
        System.out.println("2. Them mot hoc sinh moi");
    }
    public void selectAdmin(Scanner scanner) {
        menuAdmin();
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("Moi chon chuc nang: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case CREATE_NEW_TEACHER: {
                    service.createUser(scanner, Role.TEACHER);
                    break;
                }
                case CREATE_NEW_STUDENT: {
                    service.createUser(scanner, Role.STUDENT);
                    break;
                }
                case EXIT: {
                    isRunning = false;
                    break;
                }
                default: {
                    System.out.println("Vui long nhap lai!");
                    break;
                }
            }

        }


    }
}
