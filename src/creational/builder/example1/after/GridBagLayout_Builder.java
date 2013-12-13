package creational.builder.example1.after;

import javax.swing.*;
import java.awt.*;

/**
 * Created by dkocian on 12/13/13.
 */
class GridBagLayout_Builder implements Builder {
    private JPanel m_panel = new JPanel();
    private GridBagConstraints c = new GridBagConstraints();
    private int i = 0, j = 0;

    public void set_width_and_height(int width, int height) {
        m_panel.setLayout(new GridBagLayout());
        m_panel.setBackground(Color.white);
    }

    public void start_row() {
        ++i;
        j = 0;
    }

    public void build_cell(String value) {
        c.gridx = j++;
        c.gridy = i;
        m_panel.add(new Label(value), c);
    }

    public Component get_result() {
        return m_panel;
    }
}
