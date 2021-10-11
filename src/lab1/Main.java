package lab1;

public class Main {
    public static void main(String[] args) {
        System.out.println("panrama");
        System.out.println(args[0]);
        System.out.println(args[1]);
    }
}

class AnotherMain {
    public static void doStuff() {
        System.out.println("lambada");
    }

    public static void main(String[] args) {
        System.out.println("alt main");
    }
}