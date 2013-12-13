package structural.bridge.example1;

import java.util.Random;

/**
 * Created by dkocian on 12/13/13.
 */
class BridgeDisc {
    private static final String BLANK_SPACE = " ";

    public static void main(String[] args) {
        StackArray[] stacks = {new StackArray(), new StackFIFO(), new StackHanoi()};
        StackList stack2 = new StackList();
        for (int i = 1; i < 15; ++i) {
            stacks[0].push(i);
            stack2.push(i);
            stacks[1].push(i);
        }
        Random random = new Random();
        for (int i = 1; i < 15; ++i) {
            stacks[2].push(random.nextInt(20));
        }
        while (!stacks[0].isEmpty()) {
            System.out.print(stacks[0].pop() + BLANK_SPACE);
        }
        System.out.println();
        while (!stack2.isEmpty()) {
            System.out.print(stack2.pop() + BLANK_SPACE);
        }
        System.out.println();
        while (!stacks[1].isEmpty()) {
            System.out.print(stacks[1].pop() + BLANK_SPACE);
        }
        System.out.println();
        while (!stacks[2].isEmpty()) {
            System.out.print(stacks[2].pop() + BLANK_SPACE);
        }
        System.out.println();
        System.out.println("Total rejected is: " + ((StackHanoi) stacks[2]).reportRejected());
    }
}
