// Remove consecutive duplicate characters (e.g., “aaabb” → “ab”).
package Phase_5.Level_4;

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
        String print = conse(str, l - 1, 0);
        System.out.println(print);
    }

    static String conse(String str, int index, int i)
    {
        if(i > index) return "";
        if(seenAfter(str,i)) return conse(str,index,i + 1);
        return str.charAt(i) + conse(str,index,i + 1);
    }

    static boolean seenAfter(String str, int j)
    {
        if(j == 0) return false;
        return str.charAt(j) == str.charAt(j - 1);
    }

}
