package structural.composite.example4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dkocian on 12/13/13.
 */
class Box extends Entity {
    private static final String BLANK_SPACE = "   ";
    private List children = new ArrayList();
    private int value;

    public Box(int val) {
        value = val;
    }

    public void add(Entity c) {
        children.add(c);
    }

    public void traverse(int[] levels) {
        if (printThisLevel(levels)) {
            System.out.println(indent.toString() + value);
            indent.append(BLANK_SPACE);
        }
        ++level;
        for (Object aChildren : children) {
            ((Entity) aChildren).traverse(levels);
        }
        --level;
        if (printThisLevel(levels)) {
            indent.setLength(indent.length() - 3);
        }
    }
}
