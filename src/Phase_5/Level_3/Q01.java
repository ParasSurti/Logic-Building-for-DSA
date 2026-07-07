//Reverse a string without using built-in reverse.
package Phase_5.Level_3;

import Phase_5.StringTemplate;

public class Q01 extends StringTemplate
{
    public static void main(String[] args)
    {
        Q01 q = new Q01();
        q.setup();
        q.solve();
    }
    @Override
    protected void solve()
    {
        String words = reverse(str,l - 1);
        System.out.println(words);
    }
    static String reverse(String str,int index)
    {
        if(index < 0) return "";
        return str.charAt(index) + reverse(str,index - 1) ;
    }
}
