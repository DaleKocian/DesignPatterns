package structural.bridge.example2;

import static structural.bridge.example2.Stack.STACK_TYPE.*;

/**
 * Created by dkocian on 12/13/13.
 */
class Stack {
    private static final String UNKNOWN_PARAMETER = "Stack: unknown parameter";
    private StackImpl impl;

    public Stack(STACK_TYPE stackType) {
        switch (stackType) {
            case ARRAY:
                impl = new StackArray();
                break;
            case LIST:
                impl = new StackList();
                break;
            default:
                System.out.println(UNKNOWN_PARAMETER);
                break;
        }
    }

    public Stack() {
        this(ARRAY);
    }

    public void push(int in) {
        impl.push(in);
    }

    public int pop() {
        return impl.pop();
    }

    public int top() {
        return impl.top();
    }

    public boolean isEmpty() {
        return impl.isEmpty();
    }

    public boolean isFull() {
        return impl.isFull();
    }

    public enum STACK_TYPE {
        ARRAY, LIST
    }
}
