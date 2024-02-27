package service;

import entities.ClassRoom;
import entities.School;
import entities.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class SchoolService {

    public School getSchool(ClassRoom classRoom, ArrayList<ClassRoom> lstClass) {
       lstClass.add(classRoom);
       return new School(lstClass);
        }
    public void findByClass(Scanner scanner, ArrayList<ClassRoom> classRooms) {
        ArrayList<Student> lstStudent = new ArrayList<>();
        System.out.println("Moi nhap ten lop can tim: ");
        String name = scanner.nextLine();
        for (int i = 0; i < classRooms.size(); i++) {
            if (classRooms.get(i).getNameClass().equals(name)) {
                lstStudent = classRooms.get(i).getStudents();
            }
        }
        System.out.println("Danh sách học sinh: ");
        System.out.printf("%-20s%-20s%-20s\n", "Họ và Tên", "Ngày sinh", "Quê quán");
        for (Student st : lstStudent) {
            st.displayStudent();
        }
    }
    public void display(School school) {
        ArrayList<ClassRoom> lstClassrooms = school.getClasses();
        for (int i = 0; i < lstClassrooms.size(); i++) {
            System.out.println("Ten lop: " + lstClassrooms.get(i).getNameClass());
            System.out.println("Khoa hoc: " + lstClassrooms.get(i).getCourse());
            System.out.println("Hoc ki: " + lstClassrooms.get(i).getSemester());
            System.out.println("Danh sách học sinh: ");
            System.out.printf("%-20s%-20s%-20s\n", "Họ và Tên", "Ngày sinh", "Quê quán");
            for (Student st : lstClassrooms.get(i).getStudents()) {
                System.out.printf("%-20s%-20s%-20s\n", st.getName(), st.getBirthDay(), st.getHomeTown());
            }
            System.out.println("--------------------------");
        }

    }
}
