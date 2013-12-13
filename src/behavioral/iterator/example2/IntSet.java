package behavioral.iterator.example2;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.NoSuchElementException;

/**
 * Created by dkocian on 12/13/13.
 */
class IntSet {
    private Hashtable ht = new Hashtable();

    public static class Iterator {
        private IntSet set;
        private Enumeration e;
        private Integer current;

        public Iterator(IntSet in) {
            set = in;
        }

        public void first() {
            e = set.ht.keys();
            next();
        }

        public boolean isDone() {
            return current == null;
        }

        public int currentItem() {
            return current.intValue();
        }

        public void next() {
            try {
                current = (Integer) e.nextElement();
            } catch (NoSuchElementException e) {
                current = null;
            }
        }
    }

    public void add(int in) {
        ht.put(new Integer(in), "null");
    }

    public boolean isMember(int i) {
        return ht.containsKey(new Integer(i));
    }

    public Hashtable getHashtable() {
        return ht;
    }

    public Iterator createIterator() {
        return new Iterator(this);
    }
}
