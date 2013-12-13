package structural.bridge.example1;

/**
 * Created by dkocian on 12/13/13.
 */
class StackArray {
    private static final int MAX_ITEMS = 12;
    private int[] items = new int[MAX_ITEMS];
    private int total = -1;

    public void push(int i) {
        if (!isFull()) {
            items[++total] = i;
        }
    }

    public boolean isEmpty() {
        return total == -1;
    }

    public boolean isFull() {
        return total == MAX_ITEMS - 1;
    }

    public int top() {
        if (isEmpty()) {
            return -1;
        }
        return items[total];
    }

    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        return items[total--];
    }
}
