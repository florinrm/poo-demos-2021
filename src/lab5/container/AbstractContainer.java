package lab5.container;

import java.util.ArrayList;

public abstract class AbstractContainer implements Container {
    protected final ArrayList<Integer> storage = new ArrayList<>();

    @Override
    public void push(int element) {
        storage.add(element);
    }

    // metoda pop ramane abstracta
}
