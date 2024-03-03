package services;

import entities.Account;

import java.util.Scanner;

public class ResetPassword {
    public void resetPassword(Scanner scanner, Account account) {
        AccountService service = new AccountService();
        System.out.print("Mời bạn nhập Email: ");
        String email = scanner.nextLine();
        while (service.checkEmail(email)) {
            email = scanner.nextLine();
        }
        while (true) {
            if(account.getEmail().equals(email)) {
                AccountService accountService = new AccountService();
                accountService.changePassword(scanner,account);
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
