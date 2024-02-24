package entities;

public class Song {
    private int idSong;
    private String nameSong;
    private String singer;

    public Song(int idSong, String nameSong, String singer) {
        this.idSong = idSong;
        this.nameSong = nameSong;
        this.singer = singer;
    }

    @Override
    public String toString() {
        return "Song{" +
                "idSong=" + idSong +
                ", nameSong='" + nameSong + '\'' +
                ", singer='" + singer + '\'' +
                '}';
    }
}

