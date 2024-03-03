package services;

import entities.Account;
import view.Menu_Password_Incorrect;

import java.util.ArrayList;
import java.util.Scanner;

public class Password_Incorrect {
    public void passwordIncorrect(Scanner scanner, Account account, ArrayList<Account> accounts) {
        while (true) {
            Menu_Password_Incorrect menu = new Menu_Password_Incorrect();
            menu.menuPasswordIncorrect();
            System.out.print("Mời chọn chức năng: ");
            int option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case utils.Password_Incorrect.LOGIN_AGAIN:
                    LoginService service = new LoginService();
                    service.login(scanner, accounts);
                    break;
                case utils.Password_Incorrect.FORGET_PASSWORD:
                    ResetPassword resetPassword = new ResetPassword();
                    resetPassword.resetPassword(scanner, account);
                    break;
                default:
                    System.out.println("Chức năng không hợp lệ!");
                    break;
            }
        }
    }
}
