package builder.pizzaexample;

/**
 * Created by dkocian on 12/13/13.
 */
public class Pizza {
    private String dough = "";
    private String sauce = "";
    private String topping = "";

    public void setDough(String dough) {
        this.dough = dough;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    @Override
    public String toString() {
        String returnString = "----------------------\n";
        returnString += "Dough: " + dough + "\n";
        returnString += "Sauce: " + sauce + "\n";
        returnString += "Topping: " + topping;
        return returnString;
    }
}
