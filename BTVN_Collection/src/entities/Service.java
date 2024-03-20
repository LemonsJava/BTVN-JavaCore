package entities;

import java.util.List;
import java.util.Scanner;

public class Service {
    private static int autoId = 1;
    private String id;
    private String name;
    private double price;
    private String unit;

    public Service() {
    }

    public Service(String name, double price, String unit) {
        this.id = String.format("%03d", autoId++);
        this.name = name;
        this.price = price;
        this.unit = unit;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "Service{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", unit='" + unit + '\'' +
                '}';
    }
}
