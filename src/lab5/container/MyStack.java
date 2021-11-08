package lab5.container;

public class MyStack extends AbstractContainer {
    @Override
    public void pop() {
        storage.remove(storage.size() - 1);
    }
}
