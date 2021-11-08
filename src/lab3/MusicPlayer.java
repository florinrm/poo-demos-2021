package lab3;

public class MusicPlayer {
    public void playSong(Song song) {
        System.out.println("Playing " + song.getTitle() + " by " + song.getArtist().getArtisticName());
    }
}
