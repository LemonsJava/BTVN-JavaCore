import java.util.ArrayList;
import java.util.Scanner;

public class Service extends Controller {
    /*static ArrayList<Student> lstStudent;

    static {
        lstStudent = new ArrayList<>();
    }*/

    ArrayList<Student> lstStudent = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    public boolean addStudent(){
        System.out.println("Moi nhap ID: ");
        int id = Integer.parseInt(sc.nextLine());
        for(Student student : lstStudent) {
            while (true) {
                if(student.getIdStudent() == id) {
                    System.out.println("ID hoc sinh da ton tai!");
                    System.out.print("Moi nhap lai ID: ");
                    id = Integer.parseInt(sc.nextLine());
                    break;
                }
            }
        }
        System.out.println("Moi nhap ho va ten: ");
        String name = sc.nextLine();
        System.out.println("Moi nhap tuoi: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Moi nhap dia chi: ");
        String address = sc.nextLine();
        System.out.println("Moi nhap diem: ");
        double point = Double.parseDouble(sc.nextLine());
        System.out.println("Moi nhap lop: ");
        String classroom = sc.nextLine();
        return  lstStudent.add(new Student(id, name, age, address, point, classroom));
    }

    public void fixInfoStudent() {
        if(lstStudent.isEmpty()) {
            System.out.println("Khong co hoc sinh nao trong danh sach!");
        }
        else {
            menuFixStudent();
            int select = Integer.parseInt(sc.nextLine());
            while (true) {
                switch (select) {
                    case 1:
                        System.out.print("Moi nhap ID hoc sinh can sua: ");
                        int fId = Integer.parseInt(sc.nextLine());
                        for (Student s : lstStudent) {
                            while (true) {
                                if (s.getIdStudent() == fId) {
                                    System.out.println("Thong tin hoc sinh: ");
                                    System.out.println(s);
                                    System.out.println("Moi nhap ID moi:");
                                    int newId = Integer.parseInt(sc.nextLine());
                                    if (newId != s.getIdStudent()) {
                                        s.setIdStudent(newId);
                                        System.out.println("Thong tin hoc sinh sau sua:");
                                        System.out.println(s);
                                        break;
                                    }
                                    else {
                                        System.out.println("ID da ton tai!");
                                        System.out.println("Moi nhap lai ID: ");
                                        fId = Integer.parseInt(sc.nextLine());
                                    }
                                }
                                else {
                                    System.out.println("Hoc sinh chua co trong danh sach !");
                                    System.out.print("Moi nhap lai ID: ");
                                    fId = Integer.parseInt(sc.nextLine());
                                }
                            }
                            break;
                        }
                    case 2:
                        System.out.print("Moi nhap ID hoc sinh can sua: ");
                        int fId2 = Integer.parseInt(sc.nextLine());
                        for (Student s : lstStudent) {
                            while (true) {
                                if (s.getIdStudent() == fId2) {
                                    System.out.println("Thong tin hoc sinh: ");
                                    System.out.println(s);
                                    System.out.println("Moi nhap ho va ten moi:");
                                    String newName = sc.nextLine();
                                    s.setNameStudent(newName);
                                    System.out.println("Thong tin hoc sinh sau sua: ");
                                    System.out.println(s);
                                    break;
                                }
                                else {
                                    System.out.println("Hoc sinh chua co trong danh sach !");
                                    System.out.print("Moi nhap lai ID: ");
                                    fId2 = Integer.parseInt(sc.nextLine());
                                }
                            }
                        }
                        break;
                    case 3:
                        System.out.print("Moi nhap ID hoc sinh can sua: ");
                        int fId3 = Integer.parseInt(sc.nextLine());
                        for (Student s : lstStudent) {
                            while (true) {
                                if (s.getIdStudent() == fId3) {
                                    System.out.println("Thong tin hoc sinh: ");
                                    System.out.println(s);
                                    System.out.println("Moi nhap tuoi moi:");
                                    int newAge = Integer.parseInt(sc.nextLine());
                                    s.setAgeStudent(newAge);
                                    System.out.println("Thong tin hoc sinh sau sua: ");
                                    System.out.println(s);
                                    break;
                                }
                                else {
                                    System.out.println("Hoc sinh chua co trong danh sach !");
                                    System.out.print("Moi nhap lai ID: ");
                                    fId3 = Integer.parseInt(sc.nextLine());
                                }
                            }
                        }
                    case 4:
                        System.out.print("Moi nhap ID hoc sinh can sua: ");
                        int fId4 = Integer.parseInt(sc.nextLine());
                        for (Student s : lstStudent) {
                            while (true) {
                                if (s.getIdStudent() == fId4) {
                                    System.out.println("Thong tin hoc sinh: ");
                                    System.out.println(s);
                                    System.out.println("Moi nhap dia chi moi:");
                                    String newAdd = sc.nextLine();
                                    s.setAddStudent(newAdd);
                                    System.out.println("Thong tin hoc sinh sau sua: ");
                                    System.out.println(s);
                                    break;
                                }
                                else {
                                    System.out.println("Hoc sinh chua co trong danh sach !");
                                    System.out.print("Moi nhap lai ID: ");
                                    fId4 = Integer.parseInt(sc.nextLine());
                                }
                            }
                        }
                        break;
                    case 5:
                        System.out.print("Moi nhap ID hoc sinh can sua: ");
                        int fId5 = Integer.parseInt(sc.nextLine());
                        for (Student s : lstStudent) {
                            while (true) {
                                if (s.getIdStudent() == fId5) {
                                    System.out.println("Thong tin hoc sinh: ");
                                    System.out.println(s);
                                    System.out.println("Moi nhap diem moi:");
                                    double newPoint = Double.parseDouble(sc.nextLine());
                                    s.setPointStudent(newPoint);
                                    System.out.println("Thong tin hoc sinh sau sua: ");
                                    System.out.println(s);
                                    break;
                                }
                                else {
                                    System.out.println("Hoc sinh chua co trong danh sach !");
                                    System.out.print("Moi nhap lai ID: ");
                                    fId5 = Integer.parseInt(sc.nextLine());
                                }
                            }
                        }
                        break;
                    default:
                        System.out.println("Moi nhap lai chuc nang");
                        select = Integer.parseInt(sc.nextLine());


                }
            }
        }

    }


    public void findByName(String fName) {
        for (Student s : lstStudent) {
            if (s.getNameStudent().contains(fName)) {
                System.out.println(s);
            }
        }
    }

    public void findByAge(int fAge) {
        for (Student s : lstStudent) {
            if (s.getAgeStudent() == fAge) {
                System.out.println(s);
            }
        }
    }
    public void menuFixStudent(){
        System.out.println("1. Sua ID hoc sinh.");
        System.out.println("2. Sua Ten hoc sinh.");
        System.out.println("3. Sua tuoi hoc sinh.");
        System.out.println("4. Sua dia chi hoc sinh.");
        System.out.println("5. Sua diem hoc sinh.");
    }

    public void display() {
        System.out.println("Danh sach hoc sinh la");
        for (Student s : lstStudent) {
            System.out.println(s);
        }
    }


}
