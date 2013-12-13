package structural.composite.example4;

/**
 * Created by dkocian on 12/13/13.
 */
abstract class Entity {
    protected static StringBuffer indent = new StringBuffer();
    protected static int level = 1;

    public abstract void traverse(int[] levels);

    protected boolean printThisLevel(int[] levels) {
        for (int currentLevel : levels) {
            if (level == currentLevel) {
                return true;
            }
        }
        return false;
    }
}
