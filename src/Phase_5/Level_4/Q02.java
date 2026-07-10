//Remove all spaces from a string.
package Phase_5.Level_4;

import Phase_5.OneStringTemplate;

public class Q02 extends OneStringTemplate
{
    public static void main(String[] args)
    {
        Q02 q = new Q02();
        q.setup();
        q.solve();
    }
    @Override
    protected void solve()
    {
        String print = skip(str,l -1);
        System.out.println(print);
    }
    static String skip(String str, int index)
    {
        if(index < 0) return "";
        if(str.charAt(index) == ' ') return skip(str,index - 1);
        return skip(str,index - 1) + str.charAt(index);
    }
}
