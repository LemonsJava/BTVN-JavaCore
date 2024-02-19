import java.util.Scanner;

public class Controller {



    public void run(){
        Service newService = new Service();

        Scanner sc = new Scanner(System.in);
        boolean isContinues = true;
        int choice = 0;

        while (isContinues){
            menu();
            System.out.print("Moi lua chon chuc nang: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    if(newService.addStudent()) {
                        System.out.println("Them hoc sinh thanh cong!");
                    }
                    else {
                        System.out.println("Them hoc sinh that bai!");
                    }
                    break;
                case 2:
                    newService.fixInfoStudent();
                    break;

                case 3:
                    System.out.println("Danh sach hoc sinh la:");
                    newService.display();
                    break;
                case 4:
                    System.out.println("Moi nhap ten can tim:");
                    String fName = sc.nextLine();
                    newService.findByName(fName);
                    break;
                case 5:
                    System.out.println("Moi nhap tuoi hoc sinh can tim:");
                    int fAge = Integer.parseInt(sc.nextLine());
                    newService.findByAge(fAge);
                    break;
//                case 6:
//                    System.out.println("Moi nhap ID hoc sinh can xoa:");
//                    int fID = Integer.parseInt(sc.nextLine());
//
//                    break;
                case 7:
                    isContinues = false;
                    break;
                default:
                    System.out.println("Chon sai chuc nang");
                    break;
            }
        }

    }

    public void menu() {
        System.out.println("----- MENU -----");
        System.out.println("1. Them hoc sinh moi vao danh sach");
        System.out.println("2. Sua thong tin hoc sinh");
        System.out.println("3. Xem danh sach hoc sinh");
        System.out.println(("4. Loc danh sach hoc sinh theo ten"));
        System.out.println(("5. Loc danh sach hoc sinh theo tuoi"));
        System.out.println("6. Xoa thong tin hoc sinh theo ID");
        System.out.println("7. Thoat chuong trinh");
    }
}
