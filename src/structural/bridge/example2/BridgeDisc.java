package structural.bridge.example2;

import static structural.bridge.example2.Stack.STACK_TYPE.*;

/**
 * Created by dkocian on 12/13/13.
 */
class BridgeDisc {
    private static final String BLANK_SPACE = " ";
    private static final int MAX_LOOPS = 15;
    private static final int MAX_RANDOM_VALUE = 20;

    public static void main(String[] args) {
        Stack[] stacks = {new Stack(ARRAY), new Stack(LIST), new StackFIFO(), new StackHanoi()};
        int positionOfStackHanoi = findLastInstanceOfStackHanoi(stacks);
        for (int i = 1; i < MAX_LOOPS; ++i) {
            for (int j = 0; j < stacks.length - 1; ++j) {
                stacks[j].push(i);
            }
        }
        java.util.Random rn = new java.util.Random();
        if (positionOfStackHanoi != -1) {
            for (int i = 1; i < MAX_LOOPS; ++i) {
                stacks[positionOfStackHanoi].push(rn.nextInt(MAX_RANDOM_VALUE));
            }
        }
        for (Stack stack : stacks) {
            while (!stack.isEmpty()) {
                System.out.print(stack.pop() + BLANK_SPACE);
            }
            System.out.println();
        }
        if (positionOfStackHanoi != -1) {
            System.out.println("Total rejected is: " + ((StackHanoi) stacks[positionOfStackHanoi]).reportRejected());
        }
    }

    private static int findLastInstanceOfStackHanoi(Stack[] stacks) {
        for (int i = stacks.length - 1; i >= 0; --i) {
            if (stacks[i] instanceof StackHanoi) {
                return i;
            }
        }
        return -1;
    }
}
