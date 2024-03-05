package services;

import entities.Account;
import utils.LoginFail;
import utils.LoginSucces;
import view.MenuLoginSussess;
import view.MenuLoginFail;

import java.util.ArrayList;
import java.util.Scanner;

public class PasswordService {
    private final Controller controller = new Controller();
    private final AccountService service = new AccountService();
    public void loginSusses(Scanner scanner, Account account, ArrayList<Account> accounts) {
        while (true) {
            MenuLoginSussess newMenu = new MenuLoginSussess();
            newMenu.menuLoginSusses();
            System.out.print("Mời chọn chức năng: ");
            int option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case LoginSucces.CHANGE_USERNAME:
                    service.changeUsername(scanner, account, accounts);
                    break;
                case LoginSucces.CHANGE_EMAIL:
                    service.changeEmail(scanner, account, accounts);
                    break;
                case LoginSucces.CHANGE_PASSWORD:
                    service.changePassword(scanner, account);
                    break;
                case LoginSucces.LOGOUT:
                    controller.run(scanner, accounts);
                    break;
                case LoginSucces.EXIT:
                    System.exit(0);
                default:
                    System.out.println("Chức năng không hợp lệ!");
                    break;
            }
        }
    }

    public void loginFail(Scanner scanner, Account account, ArrayList<Account> accounts) {
        while (true) {
            MenuLoginFail menu = new MenuLoginFail();
            menu.menuLoginFail();
            System.out.print("Mời chọn chức năng: ");
            int option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case LoginFail.LOGIN_AGAIN:
                    LoginService service = new LoginService();
                    service.login(scanner, accounts);
                    break;
                case LoginFail.FORGET_PASSWORD:
                    resetPassword(scanner, account);
                    break;
                default:
                    System.out.println("Chức năng không hợp lệ!");
                    break;
            }
        }
    }
    public void resetPassword(Scanner scanner, Account account) {
        System.out.print("Mời bạn nhập Email: ");
        String email = scanner.nextLine();
        while (service.checkEmail(email)) {
            email = scanner.nextLine();
        }
        while (true) {
            if(account.getEmail().equals(email)) {
                service.changePassword(scanner,account);
                break;
            }
            else {
                while (true) {
                    System.out.println("Email chưa được sử dụng!");
                    System.out.println("Bạn có muốn nhập lại Email không?(y/n)");
                    String answer = scanner.nextLine();
                    if(answer.equals("y")) {
                        System.out.print("Mời bạn nhập Email: ");
                        email = scanner.nextLine();
                        while (service.checkEmail(email)) {
                            email = scanner.nextLine();
                        }
                        break;
                    }
                    else {
                        return;
                    }
                }
            }
        }

    }
}
