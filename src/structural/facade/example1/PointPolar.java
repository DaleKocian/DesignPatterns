package structural.facade.example1;

/**
 * Created by dkocian on 12/13/13.
 */
class PointPolar {
    private double radius;
    private double angle;

    public PointPolar(double r, double a) {
        radius = r;
        angle = a;
    }

    public void rotate(int ang) {
        angle += ang % 360;
    }

    public String toString() {
        return "[" + radius + "@" + angle + "]";
    }
}
