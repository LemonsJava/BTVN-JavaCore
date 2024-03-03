import entities.Worker;
import service.WorkerService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Worker> listWorker = new ArrayList<>();
        WorkerService service = new WorkerService();
        service.saveLstWorker(scanner, listWorker);
    }
}
