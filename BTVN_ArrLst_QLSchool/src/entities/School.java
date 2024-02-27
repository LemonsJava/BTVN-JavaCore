package entities;

import java.util.ArrayList;

public class School {
    private ArrayList<ClassRoom> classes;

    public School() {
    }

    public School(ArrayList<ClassRoom> classes) {
        this.classes = classes;
    }

    public ArrayList<ClassRoom> getClasses() {
        return classes;
    }

    public void setClasses(ArrayList<ClassRoom> classes) {
        this.classes = classes;
    }

}
