package structural.bridge.example1;

/**
 * Created by dkocian on 12/13/13.
 */
class StackHanoi extends StackArray {
    private int totalRejected = 0;

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
