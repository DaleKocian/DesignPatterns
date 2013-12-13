package creational.pizzaexample;

/**
 * Created by dkocian on 12/13/13.
 */
public class BuilderExample {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        PizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();
        PizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();
        waiter.setPizzaBuilder(hawaiianPizzaBuilder);
        waiter.constructPizza();
        System.out.println(waiter.getPizza());
        waiter.setPizzaBuilder(spicyPizzaBuilder);
        waiter.constructPizza();
        System.out.println(waiter.getPizza());
    }
}
