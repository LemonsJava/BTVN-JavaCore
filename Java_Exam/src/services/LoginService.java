package services;

import entities.Account;

import java.util.ArrayList;
import java.util.Scanner;


public class LoginService {

    public void login(Scanner scanner, ArrayList<Account> accounts) {
        if (!accounts.isEmpty()) {
            System.out.print("Username: ");
            String username = scanner.nextLine();
            while (true) {
                for(Account acc : accounts) {
                    if(acc.getUsername().equals(username)) {
                        System.out.print("Mật khẩu: ");
                        String password = scanner.nextLine();
                        if (acc.getPassword().equals(password)) {
                            System.out.println("Chào mừng " + username + " đến với bình nguyên vô tận!");
                            Password_Correct service = new Password_Correct();
                            service.passwordCorrect(scanner, acc, accounts);
                        } else {
                            System.out.println("Mật khẩu không đúng!");
                            Password_Incorrect passwordIncorrect = new Password_Incorrect();
                            passwordIncorrect.passwordIncorrect(scanner, acc, accounts);
                        }
                        break;
                    }
                }
                System.out.println("Vui lòng kiểm tra lại Username!");
                System.out.print("Mời nhập lại Username: ");
                username = scanner.nextLine();
            }
        }
        else {
            System.out.println("Chưa có tài khoản nào được đăng ký!");
            System.out.println("Bạn có muốn tạo một tài khoản mới không?(y/n)");
            String answer = scanner.nextLine();
            if(answer.equalsIgnoreCase("y")){
                AccountService service = new AccountService();
                Account account = service.createAccount(scanner, accounts);
            }
        }
    }
}


