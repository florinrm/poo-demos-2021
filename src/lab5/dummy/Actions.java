package lab5.dummy;

public class Actions extends BaseClass implements ExtendedBaseInterface {
    public Actions(int a, int b) {
        super(a, b);
    }

    @Override
    public void doParticularStuff() {
        System.out.println("Actions");
    }

    @Override
    public void doFirstAction() {
        System.out.println("Ce somn bag dupa labul de POO");
    }

    @Override
    public void doSecondAction() {
        System.out.println("Cred ca jumate din studenti dorm la laborator (aya ye)");
    }

    @Override
    public void doThirdAction() {
        System.out.println("ce sila imi e sa ma duc dupa baterie la masina pfaa");
    }
}
