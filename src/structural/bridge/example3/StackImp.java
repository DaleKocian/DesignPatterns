package structural.bridge.example3;

/**
 * Created by dkocian on 12/13/13.
 */
interface StackImp {
    Object push(Object o);

    Object peek();

    boolean empty();

    Object pop();
}
