import services.LolService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LolService lol = new LolService();
        lol.startGame(scanner);
    }
}
