//Remove the first and last character and print the remaining string.
package Phase_5.Level_3;

import Phase_5.OneStringTemplate;

public class Q08 extends OneStringTemplate
{
    public static void main(String[] args)
    {
        Q08 q = new Q08();
        q.setup();
        q.solve();
    }
    @Override
    protected void solve()
    {
        String print = remove(str,l  - 1);
        System.out.println(print);
    }
    static String remove(String str, int index)
    {
        if(index < 0) return "";
        if(index == 0 || index == str.length() - 1) return   remove(str,index - 1);
        return remove(str,index - 1) + str.charAt(index);
    }
}
