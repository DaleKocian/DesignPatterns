package structural.adapter.example2after;

/**
 * Created by dkocian on 12/13/13.
 */
class LegacyRectangle {
    public void draw(int x, int y, int w, int h) {
        System.out.println("rectangle at (" + x + ',' + y + ") with width " + w + " and height " + h);
    }
}
