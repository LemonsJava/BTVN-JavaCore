public class Student extends Controller {
    private int idStudent;
    private String nameStudent;
    private int ageStudent;
    private String addStudent;
    private double pointStudent;
    private String classroom;

    public Student() {
    }

    public Student(int idStudent, String nameStudent, int ageStudent, String addStudent, double pointStudent, String classroom) {
        this.idStudent = idStudent;
        this.nameStudent = nameStudent;
        this.ageStudent = ageStudent;
        this.addStudent = addStudent;
        this.pointStudent = pointStudent;
        this.classroom = classroom;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public int getAgeStudent() {
        return ageStudent;
    }

    public void setAgeStudent(int ageStudent) {
        this.ageStudent = ageStudent;
    }

    public String getAddStudent() {
        return addStudent;
    }

    public void setAddStudent(String addStudent) {
        this.addStudent = addStudent;
    }

    public double getPointStudent() {
        return pointStudent;
    }

    public void setPointStudent(double pointStudent) {
        this.pointStudent = pointStudent;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idStudent=" + idStudent +
                ", nameStudent='" + nameStudent + '\'' +
                ", ageStudent=" + ageStudent +
                ", addStudent='" + addStudent + '\'' +
                ", pointStudent=" + pointStudent +
                ", classroom='" + classroom + '\'' +
                '}';
    }
}
