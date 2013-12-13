package structural.bridge.example3;

import static structural.bridge.example3.Stack.STACK_TYPE.*;

/**
 * Created by dkocian on 12/13/13.
 */
class Stack {
    private static final String UNKNOWN_PARAMETER = "Stack: unknown parameter";
    protected StackImp imp;

    public Stack() {
        this(JAVA);
    }

    public Stack(STACK_TYPE stackType) {
        switch (stackType) {
            case JAVA:
                imp = new StackJava();
                break;
            case MINE:
                imp = new StackMine();
                break;
            default:
                System.out.println(UNKNOWN_PARAMETER);
                break;
        }
    }

    public void push(int in) {
        imp.push(in);
    }

    public int pop() {
        return (Integer) imp.pop();
    }

    public boolean isEmpty() {
        return imp.empty();
    }

    public enum STACK_TYPE {
        JAVA, MINE
    }
}
