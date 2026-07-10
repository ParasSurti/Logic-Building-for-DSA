//Print the string after removing all digits.
package Phase_5.Level_4;

import Phase_5.OneStringTemplate;

public class Q05 extends OneStringTemplate
{
    public static void main(String[] args)
    {
        Q05 q = new Q05();
        q.setup();
        q.solve();
    }
    @Override
    protected void solve()
    {
        String print = remove(str,l - 1);
        System.out.println(print);
    }
    static String remove(String str, int index)
    {
        if(index < 0) return "";
        if(character(str,index)) return remove(str,index - 1);
        return remove(str,index - 1) + str.charAt(index) ;
    }
    static boolean character(String str,int index)
    {
        return str.charAt(index) >= '0' && str.charAt(index) <= '9';
    }
}
