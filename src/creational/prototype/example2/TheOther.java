package creational.prototype.example2;

/**
 * Created by dkocian on 12/13/13.
 */
public class TheOther implements Prototype, Command {
    public Object clone() {
        return new TheOther();
    }

    public String getName() {
        return "TheOther";
    }

    public void execute() {
        System.out.println("TheOther: execute");
    }
}
