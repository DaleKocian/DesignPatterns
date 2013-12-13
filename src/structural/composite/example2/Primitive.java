package structural.composite.example2;

/**
 * Created by dkocian on 12/13/13.
 */
class Primitive implements Component {
    private int value;

    public Primitive(int val) {
        value = val;
    }

    public void traverse() {
        System.out.print(value + "  ");
    }
}

