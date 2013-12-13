package structural.composite.example1.after;

import java.util.ArrayList;

/**
 * Created by dkocian on 12/13/13.
 */
class Directory implements AbstractFile {
    private String m_name;
    private ArrayList m_files = new ArrayList();

    public Directory(String name) {
        m_name = name;
    }

    public void add(Object obj) {
        m_files.add(obj);
    }

    public void ls() {
        System.out.println(CompositeDemo.g_indent + m_name);
        CompositeDemo.g_indent.append("   ");
        for (Object m_file : m_files) {
            // Leverage the "lowest common denominator"
            AbstractFile obj = (AbstractFile) m_file;
            obj.ls();
        }
        CompositeDemo.g_indent.setLength(CompositeDemo.g_indent.length() - 3);
    }
}
