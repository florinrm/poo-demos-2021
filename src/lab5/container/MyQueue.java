package lab5.container;

public class MyQueue extends AbstractContainer {
    @Override
    public void pop() {
        storage.remove(0);
    }
}
