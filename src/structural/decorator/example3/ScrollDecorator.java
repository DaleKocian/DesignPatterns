package structural.decorator.example3;

/**
 * Created by dkocian on 12/13/13.
 */
class ScrollDecorator extends Decorator {
    public ScrollDecorator(Widget w) {
        super(w);
    }

    public void draw() {
        super.draw();
        System.out.println("  ScrollDecorator");
    }
}
