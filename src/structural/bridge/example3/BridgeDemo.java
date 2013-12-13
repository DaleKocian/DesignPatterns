package structural.bridge.example3;

import static structural.bridge.example3.Stack.STACK_TYPE.*;

/**
 * Created by dkocian on 12/13/13.
 */
class BridgeDemo {
    private static final String BLANK_SPACE = " ";
    private static final int MAX_LOOPS = 20;
    private static final int MAX_INTEGER = 40;

    public static void main(String[] args) {
        Stack[] stacks = {new Stack(JAVA), new Stack(MINE), new StackHanoi(JAVA), new StackHanoi(MINE)};
        for (int i = 0; i < MAX_LOOPS; ++i) {
            int num = (int) (Math.random() * 1000) % MAX_INTEGER;
            for (Stack stack : stacks) {
                stack.push(num);
            }
        }
        for (Stack stack : stacks) {
            while (!stack.isEmpty()) {
                System.out.print(stack.pop() + BLANK_SPACE);
            }
            System.out.println();
        }
        System.out.println("Total rejected is: " + ((StackHanoi) stacks[3]).reportRejected());
    }
}
