package service;

import entities.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService {
    public Student creatStudent(Scanner scanner) {
        System.out.print("Moi nhap ho va ten hoc sinh: ");
        String name = scanner.nextLine();
        System.out.print("Moi nhap diem mon toan cua hoc sinh: ");
        double scoreMath = Double.parseDouble(scanner.nextLine());
        System.out.print("Moi nhap diem mon vat ly cua hoc sinh: ");
        double scorePhy = Double.parseDouble(scanner.nextLine());
        System.out.print("Moi nhap diem mon hoa hoc cua hoc sinh: ");
        double scoreChem = Double.parseDouble(scanner.nextLine());
        double scoreAvg = (scoreMath + scorePhy + scoreChem)/3;
        String rank = rank(scoreAvg);
        return new Student(name, scoreMath, scorePhy, scoreChem, scoreAvg, rank);
    }
    public void saveLstStudent(Scanner scanner, ArrayList<Student> listStudent) {
        if (listStudent == null) {
            listStudent = new ArrayList<>();
        }
        else {
            while (true) {
                Student student = creatStudent(scanner);
                listStudent.add(student);
                System.out.println("Ban co muon tiep tuc nhap khong? (y/n)");
                String answer = scanner.nextLine();
                if (answer.equalsIgnoreCase("n")) {
                    System.out.println("Danh sach hoc sinh vua nhap la:");
                    System.out.printf("%-20s%-20s%-20s%-20s\n", "ID", "Ho va ten", "Diem trung binh", "Xep loai");
                    for (Student st : listStudent) {
                        System.out.printf("%-20s%-20s%-20.2f%-20s\n", st.getId(), st.getName(), st.getScoreAvg(), st.getRank());
                    }
                    System.out.println("Tong so hoc sinh la: " + listStudent.size());
                    percentageOfStudents(listStudent);
                    break;
                }
            }
        }

    }

    public String rank(double soreAvg) {
        if (soreAvg >= 8) return "Xep loai A";
        if (soreAvg >= 6.5) return "Xep loai B";
        else return "Xep loai C";
    }

    public void percentageOfStudents(ArrayList<Student> listAllStudent) {
        float countA  = 0;
        float countB  = 0;
        if (listAllStudent == null) {
            listAllStudent = new ArrayList<>();
        }
        else {
            if((!listAllStudent.isEmpty())) {
                for(Student student : listAllStudent) {
                    if (student.getRank().equalsIgnoreCase("Xep loai A")) {
                        countA += 1;
                    }
                    else if (student.getRank().equalsIgnoreCase("Xep loai B")) {
                        countB += 1;
                    }
                }
                float perOfA =((countA /listAllStudent.size()) * 100);
                float perOfB =((countB/listAllStudent.size()) * 100);
                float perOfC = 100 - perOfA - perOfB;
                System.out.println("So hoc sinh xep loai A la: " + countA + ", chiem: " + String.format("%.2f", perOfA) +"%");
                System.out.println("So hoc sinh xep loai B la: " + countB + ", chiem: " + String.format("%.2f", perOfB) +"%");
                System.out.println("So hoc sinh xep loai C la: " + (listAllStudent.size() - countA - countB) + ", chiem: " + String.format("%.2f", perOfC) +"%");
            }
            else System.out.println("Khong co hoc sinh nao trong danh sach!");
        }
    }
}

