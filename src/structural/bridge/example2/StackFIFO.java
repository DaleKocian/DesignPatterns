package structural.bridge.example2;

import static structural.bridge.example2.Stack.STACK_TYPE.*;

/**
 * Created by dkocian on 12/13/13.
 */
class StackFIFO extends Stack {
    private StackImpl temp = new StackList();

    public StackFIFO() {
        super(ARRAY);
    }

    public StackFIFO(STACK_TYPE stackType) {
        super(stackType);
    }

    public int pop() {
        while (!isEmpty()) {
            temp.push(super.pop());
        }
        int ret = temp.pop();
        while (!temp.isEmpty()) {
            push(temp.pop());
        }
        return ret;
    }
}
