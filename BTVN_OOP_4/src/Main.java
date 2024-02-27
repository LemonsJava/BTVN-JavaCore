import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("----- MENU -----");
        System.out.println("1. Nhap thong tin bac si.");
        System.out.println("2. Nhap thong tin benh nhan.");
        System.out.println("---------------------------");
        System.out.println("Moi chon chuc nang: ");
        int choice = Integer.parseInt(sc.nextLine());



        switch (choice) {
            case 1:
                System.out.println("Nhap so luong bac si (>0):");
                int n = Integer.parseInt(sc.nextLine());
                while (true) {
                    if (n > 0) break;
                    System.out.println("Nhap lai so luong bac si:");
                    n = Integer.parseInt(sc.nextLine());
                }
                Doctor[] arrDocs = new Doctor[n];
                for (int i = 0; i < n; i++) {
                    System.out.println("Nhap thong tin bac si thu: " + (i+1));
                    System.out.println("Nhap ten bac si:");
                    String nameDoc = sc.nextLine();
                    System.out.println("Nhap tuoi bac si:");
                    int ageDoc = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhap dia chi cua bac si:");
                    String addDoc = sc.nextLine();
                    System.out.println("Nhap chuyen khoa cua bac si:");
                    String specialistDoc = sc.nextLine();
                    System.out.println("Nhap so gio lam viec cua bac si:");
                    double timeWorkDoc = Double.parseDouble(sc.nextLine());
                    arrDocs[i] = new Doctor(nameDoc, ageDoc, addDoc, specialistDoc, timeWorkDoc);
                }
                for (int i = 0; i < arrDocs.length; i++) {
                    System.out.println("Danh sach bac si:");
                    System.out.println(arrDocs[i].toString());
                }

            case 2:
                System.out.println("Nhap so luong benh nhan (>=0):");
                int m = Integer.parseInt(sc.nextLine());
                while (true) {
                    if (m >= 0) break;
                    System.out.println("Nhap lai so luong bac si:");
                    m = Integer.parseInt(sc.nextLine());
                }
                Patient[] arrPatient = new Patient[m];
                for (int j = 0; j < m; j++) {
                    System.out.println("Nhap thon tin benh nhan thu: " + (j+1));
                    System.out.println("Nhap ten benh nhan:");
                    String namePat = sc.nextLine();
                    System.out.println("Nhap tuoi benh nhan:");
                    int agePat = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhap dia chi cua benh nhan:");
                    String addPat = sc.nextLine();
                    System.out.println("Nhap so benh an:");
                    int numberMedical = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhap thoi gian nhap vien:");
                    String hospitalalizedDay = sc.nextLine();
                    arrPatient[j] = new Patient(namePat, agePat, addPat, numberMedical, hospitalalizedDay);
                }
                for (int j = 0; j < arrPatient.length; j++) {
                    System.out.println("Danh sach benh nhan: ");
                    System.out.println(arrPatient[j].toString());
                }
            default:
                System.out.println("Moi nhap lai chuc nang !");
        }
    }
}
