//Replace all spaces with ‘_’.
package Phase_5.Level_4;

import Phase_5.OneStringTemplate;

public class Q04 extends OneStringTemplate
{
    public static void main(String[] args)
    {
        Q04 q = new Q04();
        q.setup();
        q.solve();
    }
    @Override
    protected void solve()
    {
        String print = replace(str,l - 1);
        System.out.println(print);
    }
    static String replace(String str, int index)
    {
        if(index < 0) return "";
        if(str.charAt(index) == ' ') return replace(str,index - 1) + "_";
        return replace(str,index - 1) + str.charAt(index);
    }
}
