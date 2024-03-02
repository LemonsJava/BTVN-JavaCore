package services;

import entities.Account;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class AccountService {
    public Account createAccount(Scanner scanner, ArrayList<Account> accounts) {
        System.out.print("Mời bạn nhập Username mới: ");
        String inputUsername = scanner.nextLine();
        while(!checkUsername(inputUsername)){
            inputUsername = scanner.nextLine();
        }
        System.out.print("Mời bạn nhập mật khẩu mới (dài từ 7 đến 15 ký tự, chứa ít nhất 1 ký tự in hoa, 1 ký tự đặc biệt): ");
        String inputPassword = scanner.nextLine();
        while(!checkPassword(inputPassword)){
            inputPassword = scanner.nextLine();
        }
        System.out.print("Mời bạn nhập Email: ");
        String inputEmail = scanner.nextLine();
        while(!checkEmail(inputEmail)){
            inputEmail = scanner.nextLine();
        }
        if(accounts.isEmpty()) {
            accounts.add(new Account(inputUsername, inputPassword, inputEmail));
            System.out.println("Tạo tài khoản mới thành công!");
        }
        else {
            for(Account account : accounts) {
                while (true) {
                    if (account.getUsername().equals(inputUsername)) {
                        System.out.print("Username đã được sử dụng! Vui lòng nhập Username khác: ");
                        inputUsername = scanner.nextLine();
                        while (!checkUsername(inputUsername)){
                            inputUsername = scanner.nextLine();
                        }
                    } else {
                        while (true) {
                            if (account.getEmail().equals(inputEmail)) {
                                System.out.print("Email đã được sử dụng! Vui lòng nhập Email khác: ");
                                inputEmail = scanner.nextLine();
                                while (!checkEmail(inputEmail)){
                                    inputEmail = scanner.nextLine();
                                }
                            } else {
                                accounts.add(new Account(inputUsername, inputPassword, inputEmail));
                                System.out.println("Tạo tài khoản mới thành công!");
                                break;
                            }
                        }
                        break;
                    }
                }
                break;
            }
        }
        for (Account account : accounts) {
            System.out.println(account);
        }
        return new Account(inputUsername, inputPassword, inputEmail);
    }

    public boolean checkUsername(String username) {
        Pattern p = Pattern.compile("^[0-9a-zA-Z_]+$");
        if (p.matcher(username).matches()) {
            return true;
        }
        else {
            System.out.print("Username không hợp lệ! Mời nhập lại: ");
        }
        return false;
    }
    public boolean checkEmail(String username) {
        Pattern p = Pattern.compile("^[a-zA-Z0-9._-]+@[a-zA-Z0-9]+.[a-zA-Z]{2,4}$");
        if (p.matcher(username).matches()) {
            return true;
        }
        else {
            System.out.print("Email không hợp lệ! Mời nhập lại: ");
        }
        return false;
    }
    public boolean checkPassword(String username) {
        Pattern p = Pattern.compile("^(?=.*[A-Z])(?=.*[@._,;-]).{7,15}$");
        if (p.matcher(username).matches()) {
            return true;
        }
        else {
            System.out.print("Mật khẩu không hợp lệ! Mời nhập lại: ");
        }
        return false;
    }

}
