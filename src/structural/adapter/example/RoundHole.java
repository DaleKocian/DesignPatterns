package structural.adapter.example;

/**
 * Created by dkocian on 12/13/13.
 */
class RoundHole {
    private int radius;

    public RoundHole(int r) {
        radius = r;
        System.out.println("RoundHole: max SquarePeg is " + r * Math.sqrt(2));
    }

    public int getRadius() {
        return radius;
    }
}
