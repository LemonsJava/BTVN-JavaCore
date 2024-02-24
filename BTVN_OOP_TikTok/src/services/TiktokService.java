package services;

import entities.Idols;
import entities.Song;
import entities.TikTok;

import java.util.ArrayList;
import java.util.Scanner;

public class TiktokService {

    public TikTok inputTiktok(Scanner scanner) {
        IdolService idolService = new IdolService();
        ArrayList<Idols> idols = new ArrayList<>();
        idolService.saveIdols(scanner,idols);
        SongService songService = new SongService();
        ArrayList<Song> songs = new ArrayList<>();
        songService.saveSong(scanner, songs);
        return new TikTok(idols, songs);
    }
    public void display(Scanner scanner) {
        ArrayList<TikTok> tikToks = new ArrayList<>();
        TikTok tiktok = inputTiktok(scanner);
        tikToks.add(tiktok);
        System.out.println(tikToks);
    }

}
