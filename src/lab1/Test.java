package lab1;

public class Test {
    public static void main(String[] args) {
        // primitive
        int n = 69;
        char c = 'c';
        long l = 4200000;

        Song s1 = new Song();
        s1.setArtist("Florin Salam");
        s1.setTitle("Saint Tropez");
        s1.setYear(2013);

        Song s2 = new Song();
        s2.setArtist("Florin Salam");
        s2.setTitle("Ma striga lumea sefule");
        s2.setYear(2018);

        System.out.println(s1.equals(s2));

        System.out.println("Title = " + s1.getTitle());
        System.out.println("Artist = " + s1.getArtist());
        System.out.println("Year = " + s1.getYear());

        System.out.println(s1);

        String str1 = new String("Dristor");
        String str2 = " cu de toate";

        String str3 = str1 + str2;
        System.out.println(str3);
        System.out.println(str1.length());
        System.out.println(str1.charAt(0)); // str1[0]

        int[] array = new int[10];
        System.out.println(array[5]);
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 2;
        }

        Song[] songs = new Song[3];
        for (int i = 0; i < songs.length; i++) {
            songs[i] = new Song();
            songs[i].setYear(2020);
            songs[i].setTitle("After Hours");
            songs[i].setArtist("The Weeknd");
        }
    }
}
