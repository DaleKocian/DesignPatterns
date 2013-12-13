package structural.bridge.example2;

import static structural.bridge.example2.Stack.STACK_TYPE.*;

/**
 * Created by dkocian on 12/13/13.
 */
class BridgeDisc {
    private static final String BLANK_SPACE = " ";

    public static void main(String[] args) {
        Stack[] stacks = {new Stack(ARRAY), new Stack(LIST), new StackFIFO(), new StackHanoi()};
        for (int i = 1; i < 15; ++i) {
            for (int j = 0; j < 3; ++j) {
                stacks[j].push(i);
            }
        }
        java.util.Random rn = new java.util.Random();
        for (int i = 1; i < 15; ++i) {
            stacks[3].push(rn.nextInt(20));
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
