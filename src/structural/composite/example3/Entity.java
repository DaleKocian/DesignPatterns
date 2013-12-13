package structural.composite.example3;

/**
 * Created by dkocian on 12/13/13.
 */
abstract class Entity {
    protected static StringBuffer indent = new StringBuffer();

    public abstract void traverse();
}
