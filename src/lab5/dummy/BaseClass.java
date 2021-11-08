package lab5.dummy;

public abstract class BaseClass {
    private int a = 0;
    private int b = 0;

    public BaseClass(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void doStuff() {
        System.out.println("Something common between classes");
    }

    public abstract void doParticularStuff();
}
