package behavioral.iterator.example1.before;

import java.util.Collection;

/**
 * Created by dkocian on 12/13/13.
 */
class IteratorDemo {
    public static void main(String[] args) {
        SomeClassWithData some_object = new SomeClassWithData();
        for (int i = 9; i > 0; --i) {
            some_object.add(i);
        }
        Collection data = some_object.get_data();
        for (Object aData : data) {
            System.out.print(aData + "  ");
        }
        System.out.println();
        // Do we really want a client to be able to
        // trash encapsulated state?
        data.clear();
        data = some_object.get_data();
        System.out.println("size of data is " + data.size());
    }
}
