package structural.decorator.example3;

/**
 * Created by dkocian on 12/13/13.
 */
abstract class Decorator implements Widget {
    private Widget wid;

    public Decorator(Widget w) {
        wid = w;
    }

    public void draw() {
        wid.draw();
    }
}
