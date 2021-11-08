package lab3;

public class Artist {
    private String realName;
    private String artisticName;

    public Artist(String realName, String artisticName) {
        this.realName = realName;
        this.artisticName = artisticName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getArtisticName() {
        return artisticName;
    }

    public void setArtisticName(String artisticName) {
        this.artisticName = artisticName;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "realName='" + realName + '\'' +
                ", artisticName='" + artisticName + '\'' +
                '}';
    }
}
