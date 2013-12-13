package structural.bridge.example2;
import static structural.bridge.example2.Stack.STACK_TYPE.*;
/**
 * Created by dkocian on 12/13/13.
 */
class StackHanoi extends Stack {
    private int totalRejected = 0;

    public StackHanoi() {
        super(ARRAY);
    }

    public StackHanoi(STACK_TYPE stackType) {
        super(stackType);
    }

    public int reportRejected() {
        return totalRejected;
    }

    public void push(int in) {
        if (!isEmpty() && in > top()) {
            ++totalRejected;
        } else {
            super.push(in);
        }
    }
}
