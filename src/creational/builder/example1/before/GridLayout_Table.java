package creational.builder.example1.before;

import javax.swing.*;
import java.awt.*;

/**
 * Created by dkocian on 12/13/13.
 */
class GridLayout_Table {
    private JPanel m_table = new JPanel();

    public GridLayout_Table(String[][] matrix) {
        m_table.setLayout(new GridLayout(matrix[0].length, matrix.length));
        m_table.setBackground(Color.white);
        for (int i = 0; i < matrix[i].length; ++i) {
            for (int j = 0; j < matrix.length; ++j) {
                m_table.add(new Label(matrix[j][i]));
            }
        }
    }

    public Component get_table() {
        return m_table;
    }
}
