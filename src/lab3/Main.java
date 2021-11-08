package lab3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer();
        ManeleSong maneleSong = new ManeleSong(
                "Ma striga lumea sefule",
                new Artist("Florin Stoian", "Florin Salam"),
                null);
        // upcasting de la ManeleSong la Song
        musicPlayer.playSong(maneleSong);

        // upcasting - conversie de la tipul copil la tipul parinte
        Song song = maneleSong;
        song.haiLaOHora();

        // downcast
        if (song instanceof ManeleSong) {
            ManeleSong manele = (ManeleSong) song;
            manele.cevaPanarama();
        } else if (song instanceof PopularaSong) {
            PopularaSong populara = (PopularaSong) song;
            populara.haiLaOHora();
        }
        // Song song = (Song) maneleSong; // e redundant cast-ul la upcasting

        ArrayList<String> strings = new ArrayList<>();
        strings.add("panarama");
        strings.add("alta panarama");
        strings.add("ba ce naiba e sa ai lab de la 8 dimineata fmm");
        strings.add("abia astept sa dorm dupa lab");

        for (String item: strings) {
            System.out.println(item);
        }

        String firstItem = strings.get(0);
        strings.remove(0);

        for (String item: strings) {
            System.out.println(item);
        }
    }
}
