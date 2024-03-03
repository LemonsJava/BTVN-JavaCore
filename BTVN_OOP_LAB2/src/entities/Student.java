package entities;

public class Student {
    private static int idCounter = 1;
    private int id;
    private String name;
    private double scoreMath;
    private double scorePhy;
    private double scoreChem;
    private double scoreAvg;
    private String rank;

    public Student(String name, double scoreMath, double scorePhy, double scoreChem, double scoreAvg, String rank) {
        this.id = idCounter++;
        this.name = name;
        this.scoreMath = scoreMath;
        this.scorePhy = scorePhy;
        this.scoreChem = scoreChem;
        this.scoreAvg = scoreAvg;
        this.rank = rank;
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

    public double getScoreMath() {
        return scoreMath;
    }

    public void setScoreMath(double scoreMath) {
        this.scoreMath = scoreMath;
    }

    public double getScorePhy() {
        return scorePhy;
    }

    public void setScorePhy(double scorePhy) {
        this.scorePhy = scorePhy;
    }

    public double getScoreChem() {
        return scoreChem;
    }

    public void setScoreChem(double scoreChem) {
        this.scoreChem = scoreChem;
    }

    public double getScoreAvg() {
        return scoreAvg;
    }

    public void setScoreAvg(double scoreAvg) {
        this.scoreAvg = scoreAvg;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}
