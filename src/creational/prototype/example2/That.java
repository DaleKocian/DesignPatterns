package creational.prototype.example2;

/**
 * Created by dkocian on 12/13/13.
 */
public class That implements Prototype, Command {
    public Object clone() {
        return new That();
    }

    public String getName() {
        return "That";
    }

    public void execute() {
        System.out.println("That: execute");
    }
}
