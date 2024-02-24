package services;

import entities.Figure;

import java.util.ArrayList;
import java.util.Scanner;

public class G2Service {
    public  ArrayList<Figure> saveG2(Scanner scanner) {
        ArrayList<Figure> lstG2 = new ArrayList<>();
        FigureService figureService = new FigureService();
        for (int i = 0; i < 3; i++) {
            System.out.println("Nhap thong tin tuong thu " + (i + 1) + " : ");
            Figure figure = figureService.inputFigure(scanner);
            lstG2.add(figure);
        }
        return lstG2;
    }
}
