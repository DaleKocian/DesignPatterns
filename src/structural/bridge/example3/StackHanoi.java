package structural.bridge.example3;

import static structural.bridge.example3.Stack.STACK_TYPE.*;

/**
 * Created by dkocian on 12/13/13.
 */
class StackHanoi extends Stack {
    private int totalRejected = 0;

    public StackHanoi() {
        super(JAVA);
    }

    public StackHanoi(STACK_TYPE stackType) {
        super(stackType);
    }

    public int reportRejected() {
        return totalRejected;
    }

    public void push(int in) {
        if (isNotEmptyAndValueIsGreaterThanValueOnTopOfStack(in)) {
            ++totalRejected;
        } else {
            imp.push(in);
        }
    }

    private boolean isNotEmptyAndValueIsGreaterThanValueOnTopOfStack(int value) {
        return !imp.empty() && value > (Integer) imp.peek();
    }
}
