package services;

import entities.Song;

import java.util.ArrayList;
import java.util.Scanner;

public class SongService {

    public Song inputSong(Scanner scanner) {
            System.out.println("Nhap ID cua bai hat: ");
            int idSong = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhap ten bai hat:");
            String nameSong = scanner.nextLine();
            System.out.println("Nhap ten ca si the hien bai hat:");
            String nameSinger = scanner.nextLine();
            return new Song(idSong, nameSong, nameSinger);
    }

    public void saveSong(Scanner scanner, ArrayList<Song> songs) {
        System.out.println("Nhap so luong bai hat:");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            Song song = inputSong(scanner);
            songs.add(song);
        }
        System.out.println(songs);
    }
}
