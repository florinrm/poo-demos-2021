package lab3;

public class PopularaSong extends Song {
    public PopularaSong(String title, Artist artist, Album album) {
        super(title, artist, album, "populara");
    }

    @Override
    public void haiLaOHora() {
        System.out.println("Hai la o hora clasica");
    }

    @Override
    public int getNumber(int n) {
        // return n + 3;
        return super.getNumber(n) + 1;
    }

    public double getNumber() {
        return (double) this.getNumber(10) * 3.5;
    }
}
