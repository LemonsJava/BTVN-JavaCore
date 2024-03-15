package entities;

import utils.Major;

public class Subject {
    private static int autoSbId = 1;
    private int id;
    private String name;
    private int numOfCredits; // so tien chi
    private Major major;

    public Subject(String name, int numOfCredits, Major major) {
        this.id = autoSbId++;
        this.name = name;
        this.numOfCredits = numOfCredits;
        this.major = major;
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

    public int getNumOfCredits() {
        return numOfCredits;
    }

    public void setNumOfCredits(int numOfCredits) {
        this.numOfCredits = numOfCredits;
    }

    public Major getMajor() {
        return major;
    }

    public void setMajor(Major major) {
        this.major = major;
    }
}
