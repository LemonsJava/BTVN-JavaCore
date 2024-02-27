package service;

import entities.ClassRoom;
import entities.School;
import entities.Student;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentService {
    public Student getStudent(Scanner scanner) {
        System.out.print("Moi nhap ho va ten hoc sinh: ");
        String name = scanner.nextLine();
        System.out.print("Moi nhap ngay sinh cua hoc sinh (dd/MM/yyyy): ");
        String dob = scanner.nextLine();
        LocalDate birthDay = LocalDate.parse(dob, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.print("Moi nhap que quan cua hoc sinh: ");
        String homeTown = scanner.nextLine();
        return new Student(name, birthDay, homeTown);
    }

    public ArrayList<Student> saveStudent(Scanner scanner) {
        ArrayList<Student> lststudent = new ArrayList<>();
        System.out.print("Moi nhap so luong hoc sinh: ");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("Moi nhap thong tin hoc sinh thu " +(i+1) + " : ");
            Student student = getStudent(scanner);
            lststudent.add(student);
        }
        return lststudent;
    }

    public void findByDobAndHometown(Scanner scanner, School school) {
        ArrayList<Student> lstStudent = new ArrayList<>();
        for (ClassRoom e : school.getClasses()){
            for (Student student : e.getStudents()) {
                lstStudent.add(student);
            }
        }
        ArrayList<Student> lstByDobAndHometown = new ArrayList<>();
        System.out.print("Moi nhap nam sinh can tim: ");
        int year = Integer.parseInt(scanner.nextLine());
        System.out.print("Moi nhap que quan can tim: ");
        String homeTown = scanner.nextLine();
        for (int i = 0; i < lstStudent.size(); i++) {
            if (lstStudent.get(i).getBirthDay().getYear() == year && lstStudent.get(i).getHomeTown().equals(homeTown)) {
                lstByDobAndHometown.add(lstStudent.get(i));
            }
        }
        if(lstByDobAndHometown.isEmpty()) {
            System.out.println("Khong co hoc sinh nao sinh nam \'" +year+ "\' va que quan tai \'" +homeTown+"\'" );
        }
        else {
            System.out.println("Danh sach hoc sinh can tim la: ");
            System.out.printf("%-20s%-20s%-20s\n", "Họ và Tên", "Ngày sinh", "Quê quán");
            for (Student st : lstByDobAndHometown) {
                System.out.printf("%-20s%-20s%-20s\n", st.getName(), st.getBirthDay(), st.getHomeTown());
            }
        }
    }
}
