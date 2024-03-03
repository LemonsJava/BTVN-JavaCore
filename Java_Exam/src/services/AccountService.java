package services;

import entities.Account;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class AccountService {
    public Account createAccount(Scanner scanner, ArrayList<Account> accounts) {
        String inputUsername, inputPassword, inputEmail;

        do {
            System.out.print("Mời bạn nhập Username mới: ");
            inputUsername = scanner.nextLine();
        } while (checkUsername(inputUsername) || isUsernameTaken(inputUsername, accounts));

        do {
            System.out.print("Mời bạn nhập mật khẩu mới (dài từ 7 đến 15 ký tự, chứa ít nhất 1 ký tự in hoa, 1 ký tự đặc biệt): ");
            inputPassword = scanner.nextLine();
        } while (checkPassword(inputPassword));

        do {
            System.out.print("Mời bạn nhập Email: ");
            inputEmail = scanner.nextLine();
        } while (checkEmail(inputEmail) || isEmailTaken(inputEmail, accounts));

        accounts.add(new Account(inputUsername, inputPassword, inputEmail));
        System.out.println("Tạo tài khoản mới thành công!");

        return new Account(inputUsername, inputPassword, inputEmail);
    }

    public boolean checkUsername(String username) {
        Pattern p = Pattern.compile("^[0-9a-zA-Z_]+$");
        if (!p.matcher(username).matches()) {
            System.out.println("Username không hợp lệ! Mời nhập lại!");
            return true;
        }
        else {
            return false;
        }
    }
    public boolean checkEmail(String email) {
        Pattern p = Pattern.compile("^[a-zA-Z0-9._-]+@[a-zA-Z0-9]+.[a-zA-Z]{2,4}$");
        if (!p.matcher(email).matches()) {
            System.out.println("Email không hợp lệ! Mời nhập lại!");
            return true;
        }
        else {
            return false;
        }
    }
    public boolean checkPassword(String password) {
        Pattern p = Pattern.compile("^(?=.*[A-Z])(?=.*[@._,;-]).{7,15}$");
        if (!p.matcher(password).matches()) {
            System.out.println("Mật khẩu không hợp lệ! Mời nhập lại!");
            return true;
        }
        else {
            return false;
        }
    }
    public boolean isUsernameTaken(String username, ArrayList<Account> accounts) {
        for (Account account : accounts) {
            if (account.getUsername().equals(username)) {
                System.out.println("Username đã được sử dụng! Vui lòng nhập Username khác!");
                return true;
            }
        }
        return false;
    }
    public boolean isEmailTaken(String email, ArrayList<Account> accounts) {
        for (Account account : accounts) {
            if (account.getEmail().equals(email)) {
                System.out.println("Email đã được sử dụng! Vui lòng nhập Email khác!");
                return true;
            }
        }
        return false;
    }
    public boolean isPasswordTaken(String password, Account account) {
        if (account.getPassword().equals(password)) {
            System.out.println("Mật khẩu này đang được sử dụng! Vui lòng nhập mật khẩu khác!");
            return true;
        }
        return false;
    }

    public void changeUsername(Scanner scanner, Account account, ArrayList<Account> accounts) {
        String newUsername;
        do {
            System.out.print("Mời bạn nhập Username mới: ");
            newUsername = scanner.nextLine();
        } while (checkUsername(newUsername) || isUsernameTaken(newUsername, accounts));
        account.setUsername(newUsername);
        System.out.println("Thay đổi Username thành công!");
    }
    public void changeEmail(Scanner scanner, Account account, ArrayList<Account> accounts) {
        String newEmail;
        do {
            System.out.print("Mời bạn nhập Email mới: ");
            newEmail = scanner.nextLine();
        } while (checkEmail(newEmail) || isEmailTaken(newEmail, accounts));
        account.setEmail(newEmail);
        System.out.println("Thay đổi Email thành công!");
    }
    public void changePassword(Scanner scanner, Account account) {
        String newPassword;
        do {
            System.out.print("Mời bạn nhập mật khẩu mới: ");
            newPassword = scanner.nextLine();
        } while (checkPassword(newPassword) || isPasswordTaken(newPassword, account));
        account.setPassword(newPassword);
        System.out.println("Thay đổi mật khẩu thành công!");
    }

}
