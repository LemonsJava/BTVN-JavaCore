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
                    System.out.println(changeUsername(scanner, account, accounts));
                    break;
                case utils.Password_Correct.CHANGE_EMAIL:
                    System.out.println(changeEmail(scanner, account, accounts));
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
    
    public String changeUsername(Scanner scanner, Account account, ArrayList<Account> accounts) {
        String newUsername;
        do {
            System.out.print("Mời bạn nhập Username mới: ");
            newUsername = scanner.nextLine();
        } while (service.checkUsername(newUsername) || service.isUsernameTaken(newUsername, accounts));
        account.setUsername(newUsername);
        return "Thay đổi Username thành công!";
    }
    public String changeEmail(Scanner scanner, Account account, ArrayList<Account> accounts) {
        String newEmail;
        do {
            System.out.print("Mời bạn nhập Email mới: ");
            newEmail = scanner.nextLine();
        } while (service.checkEmail(newEmail) || service.isEmailTaken(newEmail, accounts));
        account.setEmail(newEmail);
        return "Thay đổi Email thành công!";
    }
    public String changePassword(Scanner scanner, Account account) {
        String newPassword;
        do {
            System.out.print("Mời bạn nhập mật khẩu mới: ");
            newPassword = scanner.nextLine();
        } while (service.checkPassword(newPassword) || service.isPasswordTaken(newPassword, account));
        account.setPassword(newPassword);
        return "Thay đổi mật khẩu thành công!";
    }
}
