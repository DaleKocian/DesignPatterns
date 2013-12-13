package creational.prototype.example2;

/**
 * Created by dkocian on 12/13/13.
 */
public class PrototypeDemo {
    public static void initializePrototypes() {
        PrototypesModule.addPrototype(new This());
        PrototypesModule.addPrototype(new That());
        PrototypesModule.addPrototype(new TheOther());
    }

    public static void main(String[] args) {
        initializePrototypes();
        Object[] objects = new Object[9];
        int total = 0;
        for (String arg : args) {
            objects[total] = PrototypesModule.findAndClone(arg);
            if (objects[total] != null) {
                total++;
            }
        }
        for (int i = 0; i < total; i++) {
            ((Command) objects[i]).execute();
        }
    }
}
