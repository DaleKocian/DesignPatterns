package behavioral.iterator.example1.before;

import java.util.Collection;
import java.util.TreeSet;

/**
 * Created by dkocian on 12/13/13.
 */
class SomeClassWithData {
    private TreeSet<Integer> m_data = new TreeSet<Integer>();

    public void add(int in) {
        m_data.add(in);
    }

    public Collection get_data() {
        return m_data;
    }
}
