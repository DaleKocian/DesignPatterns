package abstractfactory.example;

/**
 * Created by dkocian on 12/12/13.
 */
class ConcreteFactory2 extends AbstractFactory {
    AbstractProductA createProductA() {
        return new ProductA2("ProductA2");
    }

    AbstractProductB createProductB() {
        return new ProductB2("ProductB2");
    }
}