package structural.bridge.example1;

/**
 * Created by dkocian on 12/13/13.
 */
class StackFIFO extends StackArray {
    private StackArray temp = new StackArray();

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
