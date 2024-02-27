package entities;

public class TechMasterCenter {
    private String manager;
    private String teacher;
    private ClassTechMaster classTechMaster;

    public TechMasterCenter(String manager, String teacher, ClassTechMaster classTechMaster) {
        this.manager = manager;
        this.teacher = teacher;
        this.classTechMaster = classTechMaster;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public ClassTechMaster getClassTechMaster() {
        return classTechMaster;
    }

    public void setClassTechMaster(ClassTechMaster classTechMaster) {
        this.classTechMaster = classTechMaster;
    }

    public void display() {
        System.out.println("------------------------------");
        System.out.println("Thong tin trung tam TechMaster:");
        System.out.println("Ho va ten quan ly: " + manager);
        System.out.println("Ho va ten giao vien: " + teacher);
        System.out.print("Danh sach mon hoc: ");
        getClassTechMaster().displaySubjects();
        System.out.print("Danh sach hoc vien: ");
        getClassTechMaster().displayStudents();

    }
}
