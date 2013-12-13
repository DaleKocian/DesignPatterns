package abstractfactory.lookandfeel;

/**
 * Created by dkocian on 12/12/13.
 */
public class MotifLookAndFeel extends LookAndFeel {

    @Override
    Button createButton() {
        return new MotifButton("");
    }

    @Override
    EditBox createEditBox() {
        return new MotifEditBox("");
    }
}
