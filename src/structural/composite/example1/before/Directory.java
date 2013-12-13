package structural.composite.example1.before;

import java.util.ArrayList;

/**
 * Created by dkocian on 12/13/13.
 */
class Directory {
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
        for (Object obj : m_files) {
            // Recover the type of this object
            if (obj instanceof Directory) {
                ((Directory) obj).ls();
            } else {
                ((File) obj).ls();
            }
        }
        CompositeDemo.g_indent.setLength(CompositeDemo.g_indent.length() - 3);
    }
}
