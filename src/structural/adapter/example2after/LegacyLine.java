package structural.adapter.example2after;

/**
 * Created by dkocian on 12/13/13.
 */
class LegacyLine {
    public void draw(int x1, int y1, int x2, int y2) {
        System.out.println("line from (" + x1 + ',' + y1 + ") to (" + x2 + ',' + y2 + ')');
    }
}
