public class SinhVienBiz extends SvTechMaster{
    private double maketingPoint;
    private double salesPoint;

    public SinhVienBiz(String name, String majors, double maketingPoint, double salesPoint) {
        super(name, majors);
        this.maketingPoint = maketingPoint;
        this.salesPoint = salesPoint;
    }

    public double getMaketingPoint() {
        return maketingPoint;
    }


    public double getSalesPoint() {
        return salesPoint;
    }


    @Override
    public double getDiem() {
        return ((2 * getMaketingPoint() + getSalesPoint()) / 3);
    }

}

