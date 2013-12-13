package structural.bridge.example2;

/**
 * Created by dkocian on 12/13/13.
 */
interface StackImpl {
    void push(int i);

    int pop();

    int top();

    boolean isEmpty();

    boolean isFull();
}
