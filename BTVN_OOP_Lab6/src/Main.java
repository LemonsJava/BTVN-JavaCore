import entities.Teacher;
import views.MenuAdmin;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Teacher> teachers = new ArrayList<>();
        MenuAdmin menuAdmin = new MenuAdmin();
        menuAdmin.selectAdmin(scanner);
    }
}
