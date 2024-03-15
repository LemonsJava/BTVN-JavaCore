package entities;

import java.util.ArrayList;

public class ClassRoom {
    private String nameClass;
    private Teacher teacher;
    private ArrayList<Student> students;
    private Subject subjects;

    public ClassRoom(String nameClass, Teacher teacher, ArrayList<Student> students, Subject subjects) {
        this.nameClass = nameClass;
        this.teacher = teacher;
        this.students = students;
        this.subjects = subjects;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public Subject getSubjects() {
        return subjects;
    }

    public void setSubjects(Subject subjects) {
        this.subjects = subjects;
    }
}
