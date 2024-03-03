package services;

import entities.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService {
    public void creatStudent(Scanner scanner) {
        ArrayList<Student> listStudents = new ArrayList<>();
        while (true) {
            System.out.print("Mời nhập họ và tên của học sinh: ");
            String name = scanner.nextLine();
            System.out.print(" Mời nhập địa chỉ của học sinh: ");
            String address = scanner.nextLine();
            Student student = new Student(name, address);
            listStudents.add(student);
            System.out.println("Bạn có muốn tiếp tục nhập nữa hay không?(y/n)");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("n")) {
                System.out.println("Danh sách học sinh: ");
                System.out.printf("%-20s%-20s%-20s\n", "ID", "Họ và Tên", "Quê quán");
                for (Student st : listStudents) {
                    st.displayInfo();
                }
                break;
            }
        }


    }

}
