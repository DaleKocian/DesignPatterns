package structural.composite.example2;

/**
 * Created by dkocian on 12/13/13.
 */
public class Column extends Composite {
    public Column(int val) {
        super(val);
    }

    public void traverse() {
        System.out.print("Col");
        super.traverse();
    }
}