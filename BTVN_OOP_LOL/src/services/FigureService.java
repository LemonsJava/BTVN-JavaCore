package services;

import entities.Figure;
import entities.T1;

import java.util.ArrayList;
import java.util.Scanner;

public class FigureService {
    public Figure inputFigure(Scanner scanner) {
        System.out.print("Nhap ten tuong: ");
        String name = scanner.nextLine();
        System.out.print("Nhap vi tri tuong: ");
        String position = scanner.nextLine();
        return new Figure(name, position);
    }
     /*public void saveFigure(Scanner scanner, ArrayList<Figure> lstFigure) {
         for (int i = 0; i < 3; i++) {
             System.out.println("Nhap thong tin tuong thu " +(i+1) + " : ");
             Figure figure = inputFigure(scanner);
             lstFigure.add(figure);
         }
     }*/
}
