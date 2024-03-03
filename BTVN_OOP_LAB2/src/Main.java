import entities.Student;
import service.StudentService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> listStudent = new ArrayList<>();
        StudentService service = new StudentService();
        service.saveLstStudent(scanner, listStudent);
    }
}
