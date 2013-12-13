package structural.facade.example1;

/**
 * Created by dkocian on 12/13/13.
 */
class Line {
    private Point origin;
    private Point end;

    public Line(Point origin, Point end) {
        this.origin = origin;
        this.end = end;
    }

    public void move(int dx, int dy) {
        origin.move(dx, dy);
        end.move(dx, dy);
    }

    public void rotate(int angle) {
        end.rotate(angle, origin);
    }

    public String toString() {
        return "origin is " + origin + ", end is " + end;
    }
}
