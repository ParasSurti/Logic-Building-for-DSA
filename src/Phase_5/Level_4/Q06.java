//Remove duplicate characters from a string.
package Phase_5.Level_4;

import Phase_5.OneStringTemplate;

public class Q06 extends OneStringTemplate
{
    public static void main(String[] args)
    {
        Q06 q = new Q06();
        q.setup();
        q.solve();
    }
    @Override
    protected void solve()
    {
        String dupl = print(str, l-1, 0);
        System.out.println(dupl);
    }

    //walks left to right
    static String print(String str, int index, int i)
    {
        if(i > index) return "";
        if(seenBefore(str,i,0)) return print(str,index,i + 1);
        return str.charAt(i) + print(str,index,i + 1);
    }

    // scans backward from position 0 up to (but not including) i,

    static boolean seenBefore(String str,int i, int j)
    {
        if(j >= i) return false;
        if(str.charAt(i) == str.charAt(j)) return true;
        return seenBefore(str,i,j + 1);
    }
}
