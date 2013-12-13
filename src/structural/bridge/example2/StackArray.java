package structural.bridge.example2;

/**
 * Created by dkocian on 12/13/13.
 */
class StackArray implements StackImpl {
    private static final int MAX_SIZE_OF_STACK = 12;
    private int[] items = new int[MAX_SIZE_OF_STACK];
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
        return total == MAX_SIZE_OF_STACK - 1;
    }

    public int top() {
        if (isEmpty()) {
            return Integer.MIN_VALUE;
        }
        return items[total];
    }

    public int pop() {
        if (isEmpty()) {
            return Integer.MIN_VALUE;
        }
        return items[total--];
    }
}
