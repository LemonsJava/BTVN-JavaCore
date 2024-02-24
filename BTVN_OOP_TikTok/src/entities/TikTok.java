package entities;

import java.util.ArrayList;
import java.util.Scanner;

public class TikTok {
    private ArrayList<Idols> idol;
    private ArrayList<Song> song;

    public TikTok(ArrayList<Idols> idol, ArrayList<Song> song) {
        this.idol = idol;
        this.song = song;
    }


    @Override
    public String toString() {
        return "TikTok{" +
                "idol=" + idol +
                ", song=" + song +
                '}';
    }
}
