package services;

import entities.Student;
import entities.TechMasterCenter;
import utils.Constants;

import java.util.Scanner;

public class Controller {
    private final TechMasterCenterService centerService = new TechMasterCenterService();
    private TechMasterCenter techMasterCenter;
    private final StudentService studentService = new StudentService();

    public void run(Scanner scanner) {

        boolean isRunning = true;

        while (isRunning) {
            menu();
            System.out.print("Moi chon chuc nang: ");
            int option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case Constants.CREATCLASS: {
                    techMasterCenter = centerService.getInfoTechMasterCenter(scanner);
                    techMasterCenter.display();
                    break;
                }
                case Constants.ADDSTUDENT: {
                    Student newStudent = studentService.inputInfo(scanner);
                    for (int i = 0; i < techMasterCenter.getClassTechMaster().getLstStudent().size(); i++) {
                        if (techMasterCenter.getClassTechMaster().getLstStudent().get(i).getId() == newStudent.getId()) {
                            System.out.println("ID da ton tai !");
                            System.out.println("Moi nhap lai thong tin hoc vien:");
                            newStudent = studentService.inputInfo(scanner);
                            techMasterCenter.getClassTechMaster().getLstStudent().add(newStudent);
                            techMasterCenter.display();
                            break;
                        }
                        else {
                            techMasterCenter.getClassTechMaster().getLstStudent().add(newStudent);
                            techMasterCenter.display();
                            break;
                        }

                    }
                    techMasterCenter.getClassTechMaster().getLstStudent().add(newStudent);
                    techMasterCenter.display();
                    break;
                }
                case Constants.UPDATEINFOSTUDENT: {
                    studentService.updateStudent(scanner, techMasterCenter.getClassTechMaster().getLstStudent());
                    techMasterCenter.display();
                    break;
                }
                case Constants.DELETESTUDENT: {
                    studentService.delStudent(scanner, techMasterCenter.getClassTechMaster().getLstStudent());
                    techMasterCenter.display();
                    break;
                }
                case Constants.EXIT: {
                    isRunning = false;
                    break;
                }
                default: {
                    System.out.println("Chon chuc nang khong hop le! Moi chon lai chuc nang: ");
                    break;
                }
            }


        }
    }
        public void menu(){
            System.out.println("----- MENU -----");
            System.out.println("1. Tao mot lop moi.");
            System.out.println("2. Them mot hoc vien moi.");
            System.out.println("3. Cap nhat thong tin mot hoc vien.");
            System.out.println("4. Xoa mot hoc vien.");
            System.out.println("5. Exit");
        }

}
