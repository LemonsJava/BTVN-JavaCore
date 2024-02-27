package service;

import java.util.ArrayList;
import java.util.Scanner;


import entities.School;
import entities.ClassRoom;
import utils.Constants;

public class Controller {

    private final SchoolService schoolService = new SchoolService();

    private final ArrayList<ClassRoom> listOfClassrooms = new ArrayList<>();
    private School school;

    public void run(Scanner scanner) {
        boolean isRunning = true;
        while (isRunning) {
            menu();
            System.out.print("Moi chon chuc nang: ");
            int option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case Constants.CREAT_NEW_CLASS: {
                    ClassRoomService classRoomService = new ClassRoomService();
                    ClassRoom classRoom = classRoomService.getClassRoom(scanner);
                    System.out.println("------------------------");
                    System.out.println("Thong tin lop vua tao la: ");
                    classRoom.displayClass();
                    school = schoolService.getSchool(classRoom, listOfClassrooms);
                    break;
                }
                case Constants.FIND_BY_YEARANDHOMETOWN: {
                    StudentService studentService = new StudentService();
                    studentService.findByDobAndHometown(scanner, school);
                    break;
                }
                case Constants.FIND_BY_CLASS: {
                    schoolService.findByClass(scanner, school.getClasses());
                    break;
                }
                case Constants.INFO_SCHOOL: {
                    System.out.println("Thong tin tat ca cac lop hien tai la: ");
                    schoolService.display(school);
                    break;
                }
                case Constants.EXIT: {
                    isRunning = false;
                    break;
                }
            }

        }
    }

    public void menu() {
        System.out.println("----- MENU -----");
        System.out.println("1. Tao danh sach mot lop moi.");
        System.out.println("2.Hien thi danh sach hoc sinh theo nam sinh va que quan.");
        System.out.println("3. Hien thi danh sach hoc sinh theo lop.");
        System.out.println("4. Thong tin tat ca cac lop.");
        System.out.println("5. Thoat");
    }
}
