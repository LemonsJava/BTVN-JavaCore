package services;

import entities.Subject;

import java.util.ArrayList;
import java.util.Scanner;

public class SubjectService {
    public ArrayList<Subject> getSubject(Scanner scanner) {
        ArrayList<Subject> lstSubjects = new ArrayList<>();
        String name;
        System.out.print("Nhap so luong mon hoc: ");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap ten mon hoc thu " + (i+1) + " : ");
            name = scanner.nextLine();
            lstSubjects.add(new Subject(name));
        }
        return lstSubjects;
    }
}







