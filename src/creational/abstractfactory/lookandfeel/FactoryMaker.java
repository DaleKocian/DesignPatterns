package creational.abstractfactory.lookandfeel;

/**
 * Created by dkocian on 12/12/13.
 */
public class FactoryMaker {
    private static LookAndFeel lookAndFeel = null;

    static LookAndFeel getFactory(CHOICE choice) {
        switch (choice) {
            case WINDOWS:
                lookAndFeel = new WindowsLookAndFeel();
                break;
            case MOTIF:
                lookAndFeel = new MotifLookAndFeel();
                break;
        }
        return lookAndFeel;
    }

    public enum CHOICE {
        WINDOWS, MOTIF
    }
}
