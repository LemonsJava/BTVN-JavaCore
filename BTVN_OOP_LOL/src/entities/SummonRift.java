package entities;

import java.time.LocalTime;
import java.util.ArrayList;


public class SummonRift {
    private ArrayList<Figure> T1;
    private ArrayList<Figure> G2;
    private LocalTime timer;

    public SummonRift(ArrayList<Figure> t1, ArrayList<Figure> g2, LocalTime timer) {
        T1 = t1;
        G2 = g2;
        this.timer = timer;
    }

    @Override
    public String toString() {
        return "SummonRift{" +
                "T1=" + T1 +
                ", G2=" + G2 +
                ", timer=" + timer +
                '}';
    }
}
