package structural.adapter.example;

/**
 * Created by dkocian on 12/13/13.
 */
class AdapterDemoSquarePeg {
    public static void main(String[] args) {
        RoundHole rh = new RoundHole(5);
        SquarePegAdapter spa;
        for (int i = 6; i < 10; ++i) {
            spa = new SquarePegAdapter((double) i);
            // The client uses (is coupled to) the new interface
            spa.makeFit(rh);
        }
    }
}
