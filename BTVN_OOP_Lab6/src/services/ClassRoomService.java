package services;

import entities.ClassRoom;
import entities.Subject;
import entities.Teacher;

import java.util.ArrayList;
import java.util.Scanner;

public class ClassRoomService {
    public ClassRoom createClassRoom(Scanner scanner,Teacher teacher, ArrayList<Teacher> teachers, ArrayList<Subject> subjects) {
        TeacherService teacherService = new TeacherService();
        SubjectService subjectService = new SubjectService();
        String nameSubject, nameTeacher;
        System.out.println("Moi nhap ten lop: ");
        String nameClass = scanner.nextLine();







        /*do {
            System.out.println("Moi nhap ten mon hoc: ");
            nameSubject = scanner.nextLine();
        }
        while (subjectService.isSubjectTaken(nameSubject, subjects));
        Subject subject = subjectService.getSubject(nameSubject, subjects);
        do {
            System.out.println("Moi nhap ten giao vien: ");
            nameTeacher = scanner.nextLine();
        }
        while (teacherService.isTeacherTaken(nameTeacher, teachers) || teacherService.checkInvalidTeacher(teacher) || teacherService.checkMajor(teacher, subject));*/

    }
}
