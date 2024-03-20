import entities.Bill;
import entities.Customer;
import entities.Service;
import views.MenuMain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Customer> customers = new ArrayList<>();
        List<Service> services = new ArrayList<>();
        List<Bill> bills = new ArrayList<>();
        MenuMain menuMain = new MenuMain();
        menuMain.runMenuMain(scanner,customers, services, bills);

    }
}
