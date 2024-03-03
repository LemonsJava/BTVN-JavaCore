package service;

import entities.Worker;

import java.util.ArrayList;
import java.util.Scanner;

public class WorkerService {
    public Worker getWorker(Scanner scanner) {
        System.out.print("Moi nhap ho va ten cong nhan: ");
        String name = scanner.nextLine();
        System.out.print("Moi nhap tuoi cua cong nhan: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("Moi nhap luong cua cong nhan: ");
        double salary = Double.parseDouble(scanner.nextLine());
        System.out.print("Moi nhap noi lam viec: ");
        String workplace = scanner.nextLine();
        return new  Worker(name, age, salary, workplace);
    }

    public void saveLstWorker(Scanner scanner, ArrayList<Worker> listWorker) {
        while (true) {
            Worker worker = getWorker(scanner);
            listWorker.add(worker);
            System.out.println("Ban co muon tiep tuc nhap khong? (y/n)");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("n")) {
                System.out.println("Danh sach cong nhan la: ");
                System.out.printf("%-20s%-20s%-20s%-20s%-20s\n", "ID", "Họ và tên", "Age", "Lương", "Noi lam viec");
                for (Worker worker1 : listWorker) {
                    worker1.displayInfo();
                }
                break;
            }
        }
    }
}
