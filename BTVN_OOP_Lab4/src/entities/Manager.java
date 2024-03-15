package entities;

public class Manager extends Employee {
    private double bonus = 2000000;
    public Manager(String name, String position, int salary, double bonus) {
        super(name, position, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
