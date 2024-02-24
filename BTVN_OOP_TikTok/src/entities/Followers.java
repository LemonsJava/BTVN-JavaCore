package entities;

public class Followers {
    private String nameFl;
    private int idFl;
    private String emailFl;
    private int numOfLike;

    public Followers() {
    }

    public Followers(String nameFl, int idFl, String emailFl, int numOfLike) {
        this.nameFl = nameFl;
        this.idFl = idFl;
        this.emailFl = emailFl;
        this.numOfLike = numOfLike;
    }

    @Override
    public String toString() {
        return "Followers{" +
                "nameFl='" + nameFl + '\'' +
                ", idFl=" + idFl +
                ", emailFl='" + emailFl + '\'' +
                ", numOfLike=" + numOfLike +
                '}';
    }
}
