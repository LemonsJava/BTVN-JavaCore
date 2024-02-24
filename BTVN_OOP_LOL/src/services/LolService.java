package services;

import entities.Figure;
import entities.G2;
import entities.SummonRift;
import entities.T1;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;


public class LolService {
    public void startGame(Scanner scanner) {
        System.out.print("Nhap thoi gian bat dau tran dau (HH:mm): ");
        String timeString = scanner.nextLine();
        LocalTime time = LocalTime.parse(timeString, DateTimeFormatter.ofPattern("HH:mm"));
        System.out.println("Nhap thong tin doi T1:");
        T1Service teamT1 = new T1Service();
        ArrayList<Figure> lstT1 =  teamT1.saveT1(scanner);
        System.out.println("Nhap thong tin doi G2:");
        G2Service teamG2 = new G2Service();
        ArrayList<Figure> lstG2 =  teamG2.saveG2(scanner);

        SummonRift summonRift = new SummonRift(lstT1, lstG2, time);



        System.out.println("----------------");
        System.out.println("Thong tin tran dau la:");
        System.out.println(summonRift);

    }
}
