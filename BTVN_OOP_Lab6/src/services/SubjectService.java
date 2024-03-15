package services;

import entities.Subject;
import utils.Major;
import views.MenuMajor;

import java.util.ArrayList;
import java.util.Scanner;

public class SubjectService {
    public Subject createSubject(Scanner scanner) {
        System.out.println("Moi nhap ten mon hoc: ");
        String name = scanner.nextLine();
        System.out.println("Moi nhap so tin chi: ");
        int numOfCredits = Integer.parseInt(scanner.nextLine());
        MenuMajor service = new MenuMajor();
        Major major = service.selectMajor(scanner);
        return new Subject(name, numOfCredits, major);
    }

    public boolean isSubjectTaken(String name, ArrayList<Subject> subjects) {
        for (Subject subject : subjects) {
            if (subject.getName().equalsIgnoreCase(name)) {
                return false;
            }
            else System.out.println("Mon hoc khong ton tai!");
        }
        return true;
    }

    public Subject getSubject(String name, ArrayList<Subject> subjects) {
        if (!subjects.isEmpty()) {
            for (Subject subject : subjects) {
                if (subject.getName().equalsIgnoreCase(name)) {
                    return subject;
                }
            }
        }
        else System.out.println("Danh sach mon hoc trong!");
        return null;
    }


}
