package service;

import entities.ClassRoom;
import entities.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class ClassRoomService {
    public ClassRoom getClassRoom(Scanner scanner) {
        System.out.print("Moi nhap ten lop: ");
        String name = scanner.nextLine();
        System.out.print("Moi nhap khoa hoc: ");
        String course = scanner.nextLine();
        System.out.print("Moi nhap hoc ki: ");
        String semester = scanner.nextLine();
        StudentService studentService = new StudentService();
        ArrayList<Student> classRoom = studentService.saveStudent(scanner);
        return new ClassRoom(name, course, semester, classRoom);
    }

   /* public ArrayList<ClassRoom> saveClassRoom(Scanner scanner, ArrayList<ClassRoom> lstClass) {
        ClassRoom classRoom = getClassRoom(scanner);
        lstClass.add(classRoom);
        return lstClass;
    }*/
}
