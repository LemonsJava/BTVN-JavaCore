package services;

import entities.ClassTechMaster;
import entities.TechMasterCenter;

import java.util.ArrayList;
import java.util.Scanner;

public class TechMasterCenterService {
    public TechMasterCenter getInfoTechMasterCenter(Scanner scanner) {
        System.out.print("Moi nhap ten quan ly: ");
        String nameManager = scanner.nextLine();
        System.out.print("Moi nhap ten giang vien: ");
        String nameTeacher = scanner.nextLine();
        ClassTechMasterService classTechMasterService = new ClassTechMasterService();
        ClassTechMaster classTechMasters = classTechMasterService.getClassTechMaster(scanner);
        TechMasterCenter techMasterCenter = new TechMasterCenter(nameManager, nameTeacher, classTechMasters);
        return techMasterCenter;
    }
}
