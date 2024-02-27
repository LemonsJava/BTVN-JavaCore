package services;

import entities.ClassTechMaster;
import entities.Student;
import entities.Subject;

import java.util.ArrayList;
import java.util.Scanner;

public class ClassTechMasterService {
    public ClassTechMaster getClassTechMaster(Scanner scanner) {
        SubjectService subjectService = new SubjectService();
        ArrayList<Subject> lstSubjects = subjectService.getSubject(scanner);
        StudentService studentService = new StudentService();
        ArrayList<Student> lstStudent = studentService.saveInfo(scanner);
        return new ClassTechMaster(lstSubjects, lstStudent);
    }
}
