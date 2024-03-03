package entities;

public class Worker {
    private static int autoId = 1;
    private int id;
    private String name;
    private int age;
    private double salary;
    private String workplace;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Worker(String name, int age, double salary, String workplace) {
        this.id = autoId++;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.workplace = workplace;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getWorkplace() {
        return workplace;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace;
    }

    public void displayInfo() {
        System.out.printf("%-20s%-20s%-20s%-20s%-20s\n", this.id, this.name, this.age, this.salary, this.workplace);
    }
}
