package creational.abstractfactory.example;

/**
 * Created by dkocian on 12/12/13.
 */
class ConcreteFactory1 extends AbstractFactory{
    AbstractProductA createProductA(){
        return new ProductA1("ProductA1");
    }
    AbstractProductB createProductB(){
        return new ProductB1("ProductB1");
    }
}