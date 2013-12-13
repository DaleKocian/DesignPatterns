package creational.abstractfactory.lookandfeel;

/**
 * Created by dkocian on 12/12/13.
 */
public class MotifButton extends Button {
    public MotifButton(String arg) {
        System.out.println("Hello " + arg);
    }

    @Override
    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return text;
    }
}
