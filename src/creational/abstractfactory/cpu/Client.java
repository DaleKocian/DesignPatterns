package creational.abstractfactory.cpu;

/**
 * Created by dkocian on 12/13/13.
 */
public class Client {
    public void doIt() {
        AbstractFactory af;
        af = AbstractFactory.getFactory(AbstractFactory.EMBER);
//        CPU cpu = af.createCPU();
    } // doIt
}
