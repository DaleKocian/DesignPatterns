package structural.composite.example4;

/**
 * Created by dkocian on 12/13/13.
 */
class Product extends Entity {
    private int value;

    public Product(int val) {
        value = val;
    }

    public void traverse(int[] levels) {
        if (printThisLevel(levels)) {
            System.out.println(indent.toString() + value);
        }
    }
}
