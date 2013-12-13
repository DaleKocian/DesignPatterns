package structural.composite.example1.after;

/**
 * Created by dkocian on 12/13/13.
 */
class File implements AbstractFile{
    private String m_name;

    public File(String name) {
        m_name = name;
    }

    public void ls() {
        System.out.println(CompositeDemo.g_indent + m_name);
    }
}
