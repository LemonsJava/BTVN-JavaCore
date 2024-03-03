package entities;

public class Student {
    private static int idCounter  = 1;
    private int id;
    private String name;
    private String address;

    public Student(String name, String address) {
        this.id = idCounter++;
        this.name = name;
        this.address = address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void displayInfo() {
        System.out.printf("%-20s%-20s%-20s\n", this.id, this.name, this.address);
    }
}
