package creational.abstractfactory.example;

/**
 * Created by dkocian on 12/12/13.
 */
public class Client {
    public static void main(String args[]) {
        AbstractFactory pf = FactoryMaker.getFactory(FactoryMaker.CHOICE.A);
        AbstractProductA product = pf.createProductA();
        //more function calls on product
    }
}
