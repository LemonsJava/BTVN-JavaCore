
import entities.Account;
import services.Controller;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Account> accounts = new ArrayList<>();
        Controller controller = new Controller();
        controller.run(scanner, accounts);
    }
}
