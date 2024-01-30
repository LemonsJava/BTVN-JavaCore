import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap chieu dai va chieu rong hinh chu nhat (>0):");
        System.out.print("Chieu dai = ");
        double length = sc.nextDouble();
        while (true) {
            if (length > 0) {
                break;
            }
            System.out.println("Chieu dai phai lon hon 0! ");
            System.out.print("Chieu dai = ");
            length = sc.nextDouble();
        }
        System.out.print("Chieu rong = ");
        double width = sc.nextDouble();
        while (true) {
            if (width > 0 && width < length) break;
            else if (width > length) {
                System.out.println("Chieu rong phai nho hon chieu dai!");
                System.out.print("Chieu rong = ");
                width = sc.nextDouble();
            }
            else {
                System.out.println("Chieu rong phai lon hon 0! ");
                System.out.print("Chieu rong = ");
                width = sc.nextDouble();
            }
        }

        Rectangle rectangle = new Rectangle(length, width);
        System.out.println("Hinh chu nhat co chieu dai la: " + rectangle.getLength() +", chieu rong la: " + rectangle.getWidth());
        System.out.println("Dien tich hinh chu nhat la: " + rectangle.getArea());
        System.out.println("Chu vi hinh chu nhat la: " + rectangle.getPerimeter());

        System.out.println("===========================");

        System.out.println("Moi nhap canh hinh vuong(>0): ");
        System.out.print("side = ");
        double side = sc.nextDouble();
        while (true) {
            if (side > 0) break;
            System.out.println("Canh hinh vuong phai lon hon 0! ");
            System.out.print("side = ");
            side = sc.nextDouble();

        }
        Square square = new Square(side);
        System.out.println("Hinh vuong co canh la: " + square.getSide());
        System.out.println("Dien tich hinh vuong la: " + square.getArea());
        System.out.println("Chu vi hinh vuong la: " + square.getPerimeter());

    }

}