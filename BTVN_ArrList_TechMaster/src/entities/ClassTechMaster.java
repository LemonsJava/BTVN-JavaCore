package entities;

import java.util.ArrayList;

public class ClassTechMaster {
    private ArrayList<Subject> lstSubject;
    private ArrayList<Student> lstStudent;

    public ClassTechMaster(ArrayList<Subject> lstSubject, ArrayList<Student> lstStudent) {
        this.lstSubject = lstSubject;
        this.lstStudent = lstStudent;
    }

    public ArrayList<Subject> getLstSubject() {
        return lstSubject;
    }

    public void setLstSubject(ArrayList<Subject> lstSubject) {
        this.lstSubject = lstSubject;
    }

    public ArrayList<Student> getLstStudent() {
        return lstStudent;
    }

    public void setLstStudent(ArrayList<Student> lstStudent) {
        this.lstStudent = lstStudent;
    }

    public void displayStudents() {
        for (Student student : lstStudent) {
            System.out.println(student +", ");
        }
    }

    public void displaySubjects() {
        for (Subject subject : lstSubject) {
            System.out.println(subject +", ");
        }
    }

}
