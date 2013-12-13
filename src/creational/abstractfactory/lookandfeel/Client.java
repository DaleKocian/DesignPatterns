package creational.abstractfactory.lookandfeel;

/**
 * Created by dkocian on 12/12/13.
 */
public class Client {
    public static void main(String args[]) {
        LookAndFeel lookAndFeelWindows = FactoryMaker.getFactory(FactoryMaker.CHOICE.WINDOWS);
        LookAndFeel lookAndFeelMotif = FactoryMaker.getFactory(FactoryMaker.CHOICE.MOTIF);
        Button windowsButton = lookAndFeelWindows.createButton();
        Button motifButton = lookAndFeelMotif.createButton();
        EditBox windowsEditBox = lookAndFeelWindows.createEditBox();
        EditBox motifEditBox = lookAndFeelMotif.createEditBox();
    }
}
