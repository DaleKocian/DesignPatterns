package abstractfactory.lookandfeel;

/**
 * Created by dkocian on 12/12/13.
 */
abstract class Button {
    String text;
    public abstract void setText(String text);

    public abstract String getText();
}
