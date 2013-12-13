package structural.bridge.example3;

/**
 * Created by dkocian on 12/13/13.
 */
public class StackMine implements StackImp {
    private Object[] items = new Object[20];
    private int total = -1;

    public Object push(Object o) {
        return items[++total] = o;
    }

    public Object peek() {
        return items[total];
    }

    public Object pop() {
        return items[total--];
    }

    public boolean empty() {
        return total == -1;
    }
}
