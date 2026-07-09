//Reverse each word in a sentence.
package Phase_5.Level_3;

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
        String rev = sentence(str,l,0);
        System.out.println(rev);
    }
    static String sentence(String str, int index, int start)
    {
        if(start >= index) return "";
        if(start + 1 == index || str.charAt(start + 1) == ' ') return rev(str,start) + " " + sentence(str,index,start + 1);
        return sentence(str,index,start + 1);
    }
    static String rev(String str, int start)
    {
        if(start < 0 || str.charAt(start) == ' ') return "";
        return str.charAt(start) + rev(str,start - 1);
    }

}
