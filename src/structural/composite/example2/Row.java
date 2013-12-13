package structural.composite.example2;

/**
 * Created by dkocian on 12/13/13.
 */
public class Row extends Composite {
    public Row(int val) {
        super(val);
    }

    public void traverse() {
        System.out.print("Row");
        super.traverse();
    }
}
