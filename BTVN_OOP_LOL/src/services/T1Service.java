package services;

import entities.Figure;

import java.util.ArrayList;
import java.util.Scanner;

public class T1Service {
    public  ArrayList<Figure> saveT1(Scanner scanner) {
        ArrayList<Figure> lstT1 = new ArrayList<>();
        FigureService figureService = new FigureService();
        for (int i = 0; i < 3; i++) {
            System.out.println("Nhap thong tin tuong thu " + (i + 1) + " : ");
            Figure figure = figureService.inputFigure(scanner);
            lstT1.add(figure);
        }
        return lstT1;
    }
}
