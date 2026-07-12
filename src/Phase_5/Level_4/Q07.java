//Keep only the first occurrence of each character.
package Phase_5.Level_4;

import Phase_5.OneStringTemplate;

public class Q07 extends OneStringTemplate
{
    public static void main(String[] args)
    {
        Q07 q = new Q07();
        q.setup();
        q.solve();
    }
    @Override
    protected void solve()
    {
        String print = occur(str,l - 1,0);
        System.out.println(print);
    }
    static String occur(String str, int index,int i)
    {
        if(i > index) return "";
        if(seenBefore(str,i,0)) return occur(str,index,i + 1);
        return str.charAt(i) + occur(str,index,i + 1);
    }
    static Boolean seenBefore(String str, int i, int j)
    {
        if(j >= i) return false;
        if(str.charAt(j) == str.charAt(i)) return true;
        return seenBefore(str,i,j + 1);
    }
}
