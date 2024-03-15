package entities;

public class MaketingStaff extends Employee{
    private double sales; // doanh so ban hang
    private float commission; // tien hoa hong
    public MaketingStaff(String name, String position, int salary, double sales, float commission) {
        super(name, position, salary);
        this.sales = sales;
        this.commission = commission;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public float getCommission() {
        return commission;
    }

    public void setCommission(float commission) {
        this.commission = commission;
    }
}
