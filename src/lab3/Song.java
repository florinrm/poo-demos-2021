package lab3;

public class Song {
    private String title;

    // compunere - un cantec nu poate sa nu aiba un artist
    private Artist artist;

    // agregare - caci poate lipsi un album, deoarece un cantec poate sa nu fie pe un album
    private Album album;

    protected String genre;

    public Song(String title, Artist artist, Album album, String genre) {
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    // putem sa facem asta (insa doar acum) ca sa evitam instanceof si downcast - nu e de recomandat
    public void haiLaOHora() {
        System.out.println("Hore doar la muzica populara");
    }

    public int getNumber(int n) {
        return n + 1;
    }
}
