package entities;

import java.util.ArrayList;

public class ClassRoom {
    private String nameClass;
    private String course;
    private String semester;
    private ArrayList<Student> students;

    public ClassRoom(String nameClass, String course, String semester, ArrayList<Student> students) {
        this.nameClass = nameClass;
        this.course = course;
        this.semester = semester;
        this.students = students;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }
    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void displayClass() {
        System.out.println("Ten lop: " + nameClass );
        System.out.println("Khoa hoc: " + course);
        System.out.println("Hoc ki: " + semester);
        System.out.println("Danh sách học sinh: ");
        System.out.printf("%-20s%-20s%-20s\n", "Họ và Tên", "Ngày sinh", "Quê quán");
        for (Student st : getStudents()) {
            System.out.printf("%-20s%-20s%-20s\n", st.getName(), st.getBirthDay(), st.getHomeTown());
        }
    }
}



