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
                            PasswordService service = new PasswordService();
                            service.loginSusses(scanner, acc, accounts);
                        } else {
                            System.out.println("Mật khẩu không đúng!");
                            PasswordService passwordService = new PasswordService();
                            passwordService.loginFail(scanner, acc, accounts);
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
                accounts.add(service.createAccount(scanner, accounts));
            }
        }
    }
}


