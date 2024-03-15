package entities;

import java.util.ArrayList;

public class School {
    ArrayList<Teacher> listOfTeachers;
    ArrayList<Student> listOfStudents;
    ArrayList<Subject> listOfSubjects;
    ArrayList<ClassRoom> listOfClassrooms;

    public School(ArrayList<Teacher> listOfTeachers, ArrayList<Student> listOfStudents, ArrayList<Subject> listOfSubjects, ArrayList<ClassRoom> listOfClassrooms) {
        this.listOfTeachers = listOfTeachers;
        this.listOfStudents = listOfStudents;
        this.listOfSubjects = listOfSubjects;
        this.listOfClassrooms = listOfClassrooms;
    }

    public ArrayList<Teacher> getListOfTeachers() {
        return listOfTeachers;
    }

    public void setListOfTeachers(ArrayList<Teacher> listOfTeachers) {
        this.listOfTeachers = listOfTeachers;
    }

    public ArrayList<Student> getListOfStudents() {
        return listOfStudents;
    }

    public void setListOfStudents(ArrayList<Student> listOfStudents) {
        this.listOfStudents = listOfStudents;
    }

    public ArrayList<Subject> getListOfSubjects() {
        return listOfSubjects;
    }

    public void setListOfSubjects(ArrayList<Subject> listOfSubjects) {
        this.listOfSubjects = listOfSubjects;
    }

    public ArrayList<ClassRoom> getListOfClassrooms() {
        return listOfClassrooms;
    }

    public void setListOfClassrooms(ArrayList<ClassRoom> listOfClassrooms) {
        this.listOfClassrooms = listOfClassrooms;
    }
}
