package structural.decorator.example3;

/**
 * Created by dkocian on 12/13/13.
 */
class TextField implements Widget {
    private int width, height;

    public TextField(int w, int h) {
        width = w;
        height = h;
    }

    public void draw() {
        System.out.println("TextField: " + width + ", " + height);
    }
}
