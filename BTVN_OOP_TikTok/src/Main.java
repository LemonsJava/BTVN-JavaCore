import entities.Followers;
import entities.Idols;
import entities.Song;
import entities.TikTok;
import services.FollowerService;
import services.IdolService;
import services.SongService;
import services.TiktokService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TiktokService tiktokService = new TiktokService();
        tiktokService.display(scanner);

    }
}
