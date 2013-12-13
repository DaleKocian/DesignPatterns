package structural.facade.example1;

/**
 * Created by dkocian on 12/13/13.
 */
class PointCarte {
    private double x;
    private double y;

    public PointCarte(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
