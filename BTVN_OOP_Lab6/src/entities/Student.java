package entities;

import utils.Role;

public class Student extends User{
    private double avgScore;
    private int count;

    public Student(String username, String password, String email, String address, int phone, Role role, double avgScore, int count) {
        super(username, password, email, address, phone, role);
        this.avgScore = avgScore;
        this.count = count;
    }

    public double getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(double avgScore) {
        this.avgScore = avgScore;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
