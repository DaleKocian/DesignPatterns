package behavioral.chainofresponsibility.example1.before;

/**
 * Created by dkocian on 12/13/13.
 */
class Handler {
    private static java.util.Random s_rn = new java.util.Random();
    private static int s_next = 1;
    private int m_id = s_next++;

    public boolean handle(int num)
    {
        if (s_rn.nextInt(4) != 0)
        {
            System.out.print(m_id + "-busy  ");
            return false;
        }
        System.out.println(m_id + "-handled-" + num);
        return true;
    }
}
