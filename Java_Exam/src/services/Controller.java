package services;

import entities.Account;
import view.MenuHome;
import utils.Home;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    public void run(Scanner scanner, ArrayList<Account> accounts) {
        while (true) {
            MenuHome menuHome = new MenuHome();
            menuHome.menuHome();
            System.out.print("Mời nhập lựa chọn: ");
            int option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case Home.LOGIN:
                    LoginService loginService = new LoginService();
                    loginService.login(scanner, accounts);
                    break;
                case Home.REGISTER:
                    AccountService accountService = new AccountService();
                    accountService.createAccount(scanner, accounts);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
                    break;
            }
        }
    }
}
