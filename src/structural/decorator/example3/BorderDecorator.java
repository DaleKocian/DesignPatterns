package structural.decorator.example3;

/**
 * Created by dkocian on 12/13/13.
 */
class BorderDecorator extends Decorator {
    public BorderDecorator(Widget w) {
        super(w);
    }

    public void draw() {
        super.draw();
        System.out.println("  BorderDecorator");
    }
}
