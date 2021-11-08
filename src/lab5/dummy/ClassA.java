package lab5.dummy;

public class ClassA extends BaseClass {
    public ClassA(int a, int b) {
        super(a, b);
    }

    @Override
    public void doParticularStuff() {
        System.out.println("ClassA");
    }
}
