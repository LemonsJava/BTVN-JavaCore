package services;

import entities.Account;

import java.util.Scanner;

public class ResetPassword {
    public void resetPassword(Scanner scanner, Account account) {
        String password;
        AccountService service = new AccountService();
        System.out.println("Mời bạn nhập Email: ");
        String email = scanner.nextLine();
        if(account.getEmail().equals(email)) {
            System.out.print("Mời bạn nhập mật khẩu mới: ");
            password = scanner.nextLine();
            while (service.checkPassword(password)) {
                password = scanner.nextLine();
            }
            account.setPassword(password);
            System.out.println("Đổi mật khẩu thành công!");
        }
        else {
            System.out.println("Tài khoản chưa tồn tại!");
        }
    }
}
