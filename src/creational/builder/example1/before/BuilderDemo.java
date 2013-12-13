package creational.builder.example1.before;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Created by dkocian on 12/13/13.
 */
public class BuilderDemo {
    public static String[][] read_data_file(String file_name) {
        String[][] matrix = null;
        try {
            BufferedReader br = new BufferedReader(new FileReader(file_name));
            String line, cell = "";
            String[] tokens;
            boolean first_line = true;
            int row = 0, col = 0;
            while ((line = br.readLine()) != null) {
                // Use "whitespace" to tokenize each line
                // java.sun.com/docs/books/tutorial/extra/
                //    regex/pre_char_classes.html
                tokens = line.split("\\s");
                int i = 0;
                if (first_line) {
                    matrix = new String[Integer.parseInt(tokens[0])
                            ][Integer.parseInt(tokens[1])];
                    i = 2;
                    first_line = false;
                }
                for (; i < tokens.length; ++i) {
                    if (tokens[i].equals("")) {
                        matrix[col][row++] = cell;
                        cell = "";
                        col = 0;
                    } else if (tokens[i].equals("")) {
                        matrix[col++][row] = cell;
                        cell = "";
                    } else {
                        cell += " " + tokens[i];
                    }
                }
            }
            matrix[col][row] = cell;
            br.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return matrix;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("BuilderDemo - " + args[0]);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String[][] matrix = read_data_file("BuilderDemo.dat");
        if (args[0].equals("JTable_Table")) {
            frame.getContentPane().add(new JTable_Table(matrix).get_table());
        } else if (args[0].equals("GridLayout_Table")) {
            frame.getContentPane().add(new GridLayout_Table(matrix).get_table());
        } else if (args[0].equals("GridBagLayout_Table")) {
            frame.getContentPane().add(new GridBagLayout_Table(matrix).get_table());
        }
        frame.pack();
        frame.setVisible(true);
    }
}
