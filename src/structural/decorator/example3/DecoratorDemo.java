package structural.decorator.example3;

/**
 * Created by dkocian on 12/13/13.
 */
public class DecoratorDemo {
    public static void main(String[] args) {
        Widget aWidget = new BorderDecorator(new BorderDecorator(new ScrollDecorator(new TextField(80, 24))));
        aWidget.draw();
    }
}
