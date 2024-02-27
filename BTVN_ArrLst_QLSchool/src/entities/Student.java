package entities;

import java.time.LocalDate;

public class Student {
    private String name;
    private LocalDate birthDay;
    private String homeTown;

    public Student(String name, LocalDate birthDay, String homeTown) {
        this.name = name;
        this.birthDay = birthDay;
        this.homeTown = homeTown;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public void displayStudent() {
        System.out.printf("%-20s%-20s%-20s\n", name, birthDay, homeTown);
    }
}


