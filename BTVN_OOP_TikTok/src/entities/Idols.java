package entities;

import java.util.ArrayList;

public class Idols {
    private String nameIdol;
    private int idIdol;
    private String emailIdol;
    private String groupIdol;
    private ArrayList<Followers> followers;

    public Idols(String nameIdol, int idIdol, String emailIdol, String groupIdol, ArrayList<Followers> followers) {
        this.nameIdol = nameIdol;
        this.idIdol = idIdol;
        this.emailIdol = emailIdol;
        this.groupIdol = groupIdol;
        this.followers = followers;
    }

    @Override
    public String toString() {
        return "Idols{" +
                "nameIdol='" + nameIdol + '\'' +
                ", idIdol=" + idIdol +
                ", emailIdol='" + emailIdol + '\'' +
                ", groupIdol='" + groupIdol + '\'' +
                ", followers=" + followers +
                '}';
    }
}
