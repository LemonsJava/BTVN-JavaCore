package services;

import entities.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService {
    public Student inputInfo(Scanner scanner) {
        System.out.print("Moi nhap ID cua hoc vien: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Moi nhap ho va ten hoc vien: ");
        String name = scanner.nextLine();
        System.out.print("Moi nhap tuoi hoc vien: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("Moi nhap hoc luc cua hoc vien: ");
        String rank = scanner.nextLine();
        return new Student(id, name, age, rank);
    }

    public ArrayList<Student> saveInfo(Scanner scanner) {
        ArrayList<Student> lstStudent = new ArrayList<>();
        System.out.print("Moi nhap so luong hoc vien (>0): ");
        int n = Integer.parseInt(scanner.nextLine());
        while (true) {
            if (n <= 0) {
                System.out.print("Moi nhap lai so luong hoc vien: ");
                n = Integer.parseInt(scanner.nextLine());
            } else {
                for (int i = 0; i < n; i++) {
                    System.out.println("Moi nhap thong tin hoc vien thu " + (i+1) + " : ");
                    Student student = inputInfo(scanner);
                    lstStudent.add(student);
                }
                break;
            }
        }
        return lstStudent;
    }

    public void updateStudent(Scanner scanner, ArrayList<Student> lstStudent) {
        System.out.println("Moi nhap ID hoc vien can sua thong tin:");
        int inputID = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < lstStudent.size(); i++) {
            if (lstStudent.get(i).getId() == inputID) {
                System.out.print("Moi nhap ho va ten moi cua hoc vien: ");
                String name = scanner.nextLine();
                System.out.print("Moi nhap tuoi moi cua hoc vien: ");
                int age = Integer.parseInt(scanner.nextLine());
                System.out.print("Moi nhap hoc luc moi cua hoc vien: ");
                String rank = scanner.nextLine();
                lstStudent.get(i).setName(name);
                lstStudent.get(i).setAge(age);
                lstStudent.get(i).setRank(rank);
                System.out.println("Thong tin hoc vien duoc sua thanh cong.");
            }
            else {
                System.out.println("Hoc vien khong co trong danh sach.");
            }
        }
    }

    public void delStudent(Scanner scanner, ArrayList<Student> lstStudent){
        System.out.print("Moi nhap ID hoc vien can xoa: ");
        int idDel = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < lstStudent.size(); i++) {
            if (lstStudent.get(i).getId() == idDel) {
                lstStudent.remove(i);
                System.out.println("Hoc vien da duoc xoa khoi danh sach.");
                return;
            }
            else {
                System.out.println("Hoc vien khong co trong danh sach !");
            }
        }


    }
}
