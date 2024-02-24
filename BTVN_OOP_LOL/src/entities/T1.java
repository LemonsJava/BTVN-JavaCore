package entities;

import java.util.ArrayList;

public class T1 {
    private ArrayList<Figure> figures;

    public T1(ArrayList<Figure> figures) {
        this.figures = figures;
    }

    @Override
    public String toString() {
        return "T1{" +
                "figure=" + figures +
                '}';
    }
}
