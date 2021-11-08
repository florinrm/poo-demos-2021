package lab5.dummy;

public class Main {
    public static void main(String[] args) {
        // BaseClass baseClass = new BaseClass(10, 20);
        BaseClass obj1 = new ClassA(10, 20);
        BaseClass obj2 = new ClassB(20, 30);

        obj1.doParticularStuff();
        obj2.doParticularStuff();
    }
}
