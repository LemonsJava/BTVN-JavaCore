package services;

import entities.Account;
import view.Menu_Password_Correct;

import java.util.ArrayList;
import java.util.Scanner;

public class Password_Correct {
    private final Controller controller = new Controller();
    private final AccountService service = new AccountService();
    public void passwordCorrect(Scanner scanner, Account account, ArrayList<Account> accounts) {
        while (true) {
            Menu_Password_Correct newMenu = new Menu_Password_Correct();
            newMenu.menuLoginCorrect();
            System.out.print("Mời chọn chức năng: ");
            int option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case utils.Password_Correct.CHANGE_USERNAME:
                    service.changeUsername(scanner, account, accounts);
                    break;
                case utils.Password_Correct.CHANGE_EMAIL:
                    service.changeEmail(scanner, account, accounts);
                    break;
                case utils.Password_Correct.CHANGE_PASSWORD:
                    service.changePassword(scanner, account);
                    break;
                case utils.Password_Correct.LOGOUT:
                    controller.run(scanner, accounts);
                    break;
                case utils.Password_Correct.EXIT:
                    System.exit(0);
                default:
                    System.out.println("Chức năng không hợp lệ!");
                    break;
            }
        }
    }
}
