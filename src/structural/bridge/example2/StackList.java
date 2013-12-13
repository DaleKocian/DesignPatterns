package structural.bridge.example2;

/**
 * Created by dkocian on 12/13/13.
 */
class StackList implements StackImpl {
    private Node last;

    public void push(int i) {
        if (isEmpty()) {
            last = new Node(i);
        } else {
            last.next = new Node(i);
            last.next.prev = last;
            last = last.next;
        }
    }

    public boolean isEmpty() {
        return last == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty()) {
            return Integer.MIN_VALUE;
        }
        return last.value;
    }

    public int pop() {
        if (isEmpty()) {
            return Integer.MIN_VALUE;
        }
        int ret = last.value;
        last = last.prev;
        return ret;
    }
}
