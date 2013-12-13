package structural.composite.example3;

/**
 * Created by dkocian on 12/13/13.
 */
class Product extends Entity {
    private int value;
    public Product( int val ) { value = val; }
    public void traverse() {
        System.out.println( indent.toString() + value );
    }
}
