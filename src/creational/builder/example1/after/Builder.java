package creational.builder.example1.after;

import java.awt.*;

/**
 * Created by dkocian on 12/13/13.
 */
interface Builder {
    void set_width_and_height(int width, int height);
    void start_row();
    void build_cell(String value);
    Component get_result();
}
