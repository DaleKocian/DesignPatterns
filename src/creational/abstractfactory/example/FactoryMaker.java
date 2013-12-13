package creational.abstractfactory.example;

/**
 * Created by dkocian on 12/12/13.
 */
class FactoryMaker {
    private static AbstractFactory pf = null;

    static AbstractFactory getFactory(CHOICE choice) {
        switch (choice) {
            case A:
                pf = new ConcreteFactory1();
                break;
            case B:
                pf = new ConcreteFactory2();
                break;
        }
        return pf;
    }

    public enum CHOICE {
        A, B
    }
}
