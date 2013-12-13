package creational.builder.example1.after;

import javax.swing.*;
import javax.swing.table.TableModel;
import java.awt.*;

/**
 * Created by dkocian on 12/13/13.
 */
class JTable_Builder implements Builder {
    private JTable m_table;
    private TableModel m_model;
    private int i = 0, j = 0;

    public void set_width_and_height(int width, int height) {
        m_table = new JTable(height, width);
        m_model = m_table.getModel();
    }

    public void start_row() {
        ++i;
        j = 0;
    }

    public void build_cell(String value) {
        m_model.setValueAt(value, i, j++);
    }

    public Component get_result() {
        return m_table;
    }
}
