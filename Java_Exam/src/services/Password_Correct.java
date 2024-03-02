package services;

import entities.Account;
import view.Menu_Password_Correct;

import java.util.ArrayList;
import java.util.Scanner;

public class Password_Correct {
    private final Controller controller = new Controller();
    public void passwordCorrect(Scanner scanner, Account account, ArrayList<Account> accounts) {
        while (true) {
            Menu_Password_Correct newMenu = new Menu_Password_Correct();
            newMenu.menuLoginCorrect();
            System.out.print("Mời chọn chức năng: ");
            int option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case utils.Password_Correct.CHANGE_USERNAME:
                    System.out.println(changeUsername(scanner, account));
                    break;
                case utils.Password_Correct.CHANGE_EMAIL:
                    System.out.println(changeEmail(scanner, account));
                    break;
                case utils.Password_Correct.CHANGE_PASSWORD:
                    System.out.println(changePassword(scanner, account));
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
    
    public String changeUsername(Scanner scanner, Account account) {
        System.out.print("Mời bạn nhập Username mới: ");
        String newUsername = scanner.nextLine();
        AccountService service  = new AccountService();
        while (!service.checkUsername(newUsername)) {
            newUsername = scanner.nextLine();
        }
        account.setUsername(newUsername);
        return "Thay đổi Username thành công!";
    }
    public String changeEmail(Scanner scanner, Account account) {
        System.out.print("Mời bạn nhập Email mới: ");
        String newEmail = scanner.nextLine();
        AccountService service  = new AccountService();
        while (!service.checkEmail(newEmail)) {
            newEmail = scanner.nextLine();
        }
        account.setEmail(newEmail);
        return "Thay đổi Email thành công!";
    }
    public String changePassword(Scanner scanner, Account account) {
        System.out.print("Mời bạn nhập mật khẩu mới: ");
        String newPassword = scanner.nextLine();
        AccountService service  = new AccountService();
        while (!service.checkPassword(newPassword)) {
            newPassword = scanner.nextLine();
        }
        account.setPassword(newPassword);
        return "Thay đổi mật khẩu thành công!";
    }
}
