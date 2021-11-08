package lab5.dummy;

public class ClassB extends BaseClass {
    public ClassB(int a, int b) {
        super(a, b);
    }

    @Override
    public void doParticularStuff() {
        System.out.println("ClassB");
    }
}
