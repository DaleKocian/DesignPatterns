package abstractfactory.lookandfeel;

/**
 * Created by dkocian on 12/12/13.
 */
public class WindowsLookAndFeel extends LookAndFeel {
    Button createButton() {
        return new WindowsButton("");
    }
    EditBox createEditBox() {
        return new WindowsEditBox("");
    }
}
