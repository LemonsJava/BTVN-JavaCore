import java.util.Scanner;

public class SinhVienIT extends SvTechMaster{


    private double javaPoint;
    private double htmlPoint;
    private double cssPoint;




    public SinhVienIT(String name, String majors, double javaPoint, double htmlPoint, double cssPoint) {
        super(name, majors);
        this.javaPoint = javaPoint;
        this.htmlPoint = htmlPoint;
        this.cssPoint = cssPoint;
    }



    public double getJavaPoint() {
        return javaPoint;
    }


    public double getHtmlPoint() {
        return htmlPoint;
    }


    public double getCssPoint() {
        return cssPoint;
    }




    @Override
    public double getDiem() {
        return ((2 * getJavaPoint() + getHtmlPoint() + getCssPoint()) / 4);
    }

}

