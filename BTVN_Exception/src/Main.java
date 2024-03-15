import Exceptions.InvalidBankException;
import Exceptions.InvalidCustomerException;
import Exceptions.InvalidSAvingAccountException;
import Exceptions.MaxSavingsAccountException;
import entities.Bank;
import entities.Customer;
import entities.SavingAccount;
import views.MenuMain;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InvalidCustomerException, InvalidBankException, MaxSavingsAccountException, InvalidSAvingAccountException {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Customer> customers = new ArrayList<>();
        ArrayList<Bank> banks = new ArrayList<>();
        ArrayList<SavingAccount> savingAccounts = new ArrayList<>();
        MenuMain menuMain = new MenuMain();
        menuMain.run(scanner, customers, banks, savingAccounts);
    }
}
