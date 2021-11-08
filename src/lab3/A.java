package lab3;

public class A {
    public void doStuff() {
        System.out.println("A");
    }
}

class B {
    public void doStuff() {
        System.out.println("B");
    }
}

//class C extends A, B {
//
//}

class C {
    A a;
    B b;
}
