package behavioral.command.example1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dkocian on 12/13/13.
 */
public class CommandQueue {
    interface Command {
        void execute();
    }

    static class DomesticEngineer implements Command {
        public void execute() {
            System.out.println("take out the trash");
        }
    }

    static class Politician implements Command {
        public void execute() {
            System.out.println("take money from the rich, take votes from the poor");
        }
    }

    static class Programmer implements Command {
        public void execute() {
            System.out.println("sell the bugs, charge extra for the fixes");
        }
    }

    public static List produceRequests() {
        List queue = new ArrayList();
        queue.add(new DomesticEngineer());
        queue.add(new Politician());
        queue.add(new Programmer());
        return queue;
    }

    public static void workOffRequests(List queue) {
        for (Object aQueue : queue) {
            ((Command) aQueue).execute();
        }
    }

    public static void main(String[] args) {
        List queue = produceRequests();
        workOffRequests(queue);
    }
}
