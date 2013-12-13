package abstractfactory.example;

/**
 * Created by dkocian on 12/12/13.
 */
abstract class AbstractFactory {
    abstract AbstractProductA createProductA();

    abstract AbstractProductB createProductB();
}
