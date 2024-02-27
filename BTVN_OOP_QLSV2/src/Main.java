import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap so luong sinh vien:");
        int n = Integer.parseInt(sc.nextLine());

        SvTechMaster[] arrSvTechMaster = new SvTechMaster[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Moi nhap thong tin sinh vien thu " + (i + 1) + " :");
            System.out.print("Moi nhap ho va ten sinh vien: ");
            String nameStudent = sc.nextLine();
            System.out.println("Moi chon nganh hoc sinh vien: ");
            System.out.println("1. Sinh vien IT");
            System.out.println("2. Sinh vien Biz");
            int majors = Integer.parseInt(sc.nextLine());
            while (true) {
                if (majors == 1) {
                    double javaPoint, htmlPoint, cssPoint;
                    while(true) {
                        System.out.println("Moi nhap diem JAVA: ");
                        javaPoint = Double.parseDouble(sc.nextLine());
                        if (javaPoint < 0 || javaPoint > 10) {
                            System.out.println("Diem khong hop le!! Vui long nhap diem tu 0-10.");
                        } else {
                            break;
                        }
                    }
                    while (true) {
                        System.out.println("Moi nhap diem HTML: ");
                        htmlPoint = Double.parseDouble(sc.nextLine());
                        if (htmlPoint < 0 || htmlPoint > 10) {
                            System.out.println("Diem khong hop le!! Vui long nhap diem tu 0-10.");
                        } else {
                            break;
                        }
                    }
                    while (true) {
                        System.out.println("Moi nhap diem CSS: ");
                        cssPoint = Double.parseDouble(sc.nextLine());
                        if (cssPoint < 0 || cssPoint > 10) {
                            System.out.println("Diem khong hop le!! Vui long nhap diem tu 0-10.");
                        } else {
                            break;
                        }
                    }
                    arrSvTechMaster[i] = new SinhVienIT(nameStudent, "IT", javaPoint, htmlPoint, cssPoint);
                    break;


                } else if (majors == 2) {
                    double mktPoint, salePoint;
                    while (true) {
                        System.out.println("Moi nhap diem MAKETTING: ");
                        mktPoint = Double.parseDouble(sc.nextLine());
                        if (mktPoint < 0 || mktPoint > 10) {
                            System.out.println("Diem khong hop le!! Vui long nhap diem tu 0-10.");
                        } else {
                            break;
                        }
                    }
                    while (true) {
                        System.out.println("Moi nhap diem SALE: ");
                        salePoint = Double.parseDouble(sc.nextLine());
                        if (salePoint < 0 || salePoint > 10) {
                            System.out.println("Diem khong hop le!! Vui long nhap diem tu 0-10.");
                        } else {
                            break;
                        }
                    }
                    arrSvTechMaster[i] = new SinhVienBiz(nameStudent, "BIZ", mktPoint, salePoint);
                    break;
                }
                else {
                    System.out.println("Moi nhap lai phim 1 hoac 2.");
                    majors = Integer.parseInt(sc.nextLine());
                }


            }
        }
        System.out.println("Danh sach sinh vien la:");
        for (int i = 0; i < n; i++) {
            arrSvTechMaster[i].display();
            System.out.println("----------------");
        }


    }



}

