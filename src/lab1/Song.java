package lab1;

import java.util.Objects;

public class Song {
    private String artist;
    private String title;
    private int year;

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "lab1.Song{" +
                "artist='" + artist + '\'' +
                ", title='" + title + '\'' +
                ", year=" + year +
                '}';
    }

    public void altaPanarama() {
        doStuff();
    }

    private void doStuff() {
        System.out.println("panarama");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return year == song.year && Objects.equals(artist, song.artist) && Objects.equals(title, song.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(artist, title, year);
    }
}
