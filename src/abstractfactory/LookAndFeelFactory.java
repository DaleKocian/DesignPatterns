package abstractfactory;

/**
 * Created by dkocian on 12/13/13.
 */
public class LookAndFeelFactory {
    abstract static class Button {
        String text;

        public Button(String text) {
            this.text = text;
        }

        public abstract String getText();

        public abstract void setText(String text);
    }

    abstract static class EditBox {
        String text;

        public EditBox(String text) {
            this.text = text;
        }

        public abstract String getText();

        public abstract void setText(String text);
    }

    static abstract class LookAndFeel {
        protected Button button = null;
        protected EditBox editBox = null;

        abstract Button createButton();

        abstract EditBox createEditBox();
    }

    static class WindowsLookAndFeel extends LookAndFeel {

        @Override
        Button createButton() {
            return new WindowsButton("");
        }

        @Override
        EditBox createEditBox() {
            return new WindowsEditBox("");
        }
    }

    static class MotifLookAndFeel extends LookAndFeel {

        @Override
        Button createButton() {
            return new MotifButton("");
        }

        @Override
        EditBox createEditBox() {
            return new MotifEditBox("");
        }
    }

    static class WindowsButton extends Button {
        WindowsButton(String text) {
            super(text);
        }

        @Override
        public String getText() {
            return text;
        }

        @Override
        public void setText(String text) {
            this.text = text;
        }
    }

    static class WindowsEditBox extends EditBox {

        public WindowsEditBox(String text) {
            super(text);
        }

        @Override
        public String getText() {
            return text;
        }

        @Override
        public void setText(String text) {
            this.text = text;
        }
    }

    static class MotifButton extends Button {

        public MotifButton(String text) {
            super(text);
        }

        @Override
        public String getText() {
            return text;
        }

        @Override
        public void setText(String text) {
            this.text = text;
        }
    }

    static class MotifEditBox extends EditBox {

        public MotifEditBox(String text) {
            super(text);
        }

        @Override
        public String getText() {
            return text;
        }

        @Override
        public void setText(String text) {
            this.text = text;
        }
    }

    static LookAndFeel getFactory(CHOICE choice) {
        LookAndFeel lookAndFeel = null;
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

    public static void main(String[] args) {
        LookAndFeel lookAndFeelWindows = getFactory(CHOICE.WINDOWS);
        LookAndFeel lookAndFeelMotif = getFactory(CHOICE.MOTIF);
        Button windowsButton = lookAndFeelWindows.createButton();
        Button motifButton = lookAndFeelMotif.createButton();
        EditBox windowsEditBox = lookAndFeelWindows.createEditBox();
        EditBox motifEditBox = lookAndFeelMotif.createEditBox();
    }
}
