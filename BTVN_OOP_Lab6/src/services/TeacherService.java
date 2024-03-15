package services;


import entities.Subject;
import entities.Teacher;

import java.util.ArrayList;

public class TeacherService {
    public boolean isTeacherTaken(String name, ArrayList<Teacher> teachers) {
        for (Teacher teacher : teachers) {
            if(teacher.getUsername().equalsIgnoreCase(name)){
                return false;
            }
            else {
                System.out.println("Giao vien nay khong ton tai!");
            }
        }
        return true;
    }
    public boolean checkInvalidTeacher(Teacher teacher) {
        if (teacher.getCount() > 2) {
            System.out.println("Giao vien nay da day qua so mon");
            return true;
        }
        else {
            return false;
        }
    }
    public boolean checkMajor(Teacher teacher, Subject subject) {
        if (teacher.getMajor() == subject.getMajor()) {
            return true;
        }
        else {
            System.out.println("Giao vien nay khong the day mon nay!");
            return false;
        }
    }

    public Teacher getTeacher(String name, ArrayList<Teacher> teachers) {
        if(!teachers.isEmpty()) {
            for (Teacher teacher : teachers) {
                if(teacher.getUsername().equalsIgnoreCase(name))
                    return teacher;
            }
        }
        else System.out.println("Danh sach giao vien rong!");
        return null;
    }
}
