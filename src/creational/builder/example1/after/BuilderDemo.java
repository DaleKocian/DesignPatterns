package creational.builder.example1.after;

import javax.swing.*;

/**
 * Created by dkocian on 12/13/13.
 */
public class BuilderDemo {
    public static void main(String[] args) {
        Builder target = null;
        try {
            target = (Builder) Class.forName(args[0]).newInstance();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        Reader parser = new Reader(target);
        parser.construct("BuilderDemo.dat");
        JFrame frame = new JFrame("BuilderDemo - " + args[0]);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(target.get_result());
        frame.pack();
        frame.setVisible(true);
    }
}
