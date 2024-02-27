import java.util.Scanner;

public abstract class SvTechMaster {
    protected String name;
    protected String majors;
    private double  point;


    public SvTechMaster(String name, String majors) {
        this.name = name;
        this.majors = majors;
    }


    public abstract double getDiem();

    public void getHocLuc(double point){
        if(point < 5) System.out.println("Hoc luc yeu.");
        else if(point >= 5 && point < 6.5) System.out.println("Hoc luc trung binh.");
        else if(point >= 6.5 && point < 7.5) System.out.println("Hoc luc kha.");
        else if(point >= 7.5 && point < 9) System.out.println("Hoc luc gioi.");
        else if(point >= 9 && point <= 10) System.out.println("Hoc luc xuat sac.");
    }

    public void display(){
        System.out.println("Ho va ten: " + name);
        System.out.println("Nganh hoc: "+ majors);
        System.out.println("Diem trung binh: " + getDiem());
        System.out.print("Xep loai hoc luc: ");
        getHocLuc(getDiem());
    }

}

