//Count how many spaces are there in a sentence.
package Phase_5.Level_2;

import Phase_5.StringTemplate;

public class Q05 extends StringTemplate
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
        int space = count(str,l - 1);
        System.out.println("There are total " + space + " spaces in the String!! ");
    }
    static int count(String str, int index)
    {
        if(index < 0) return 0;
        if(str.charAt(index) == ' ') return count(str,index - 1) + 1;
        return count(str,index - 1);
    }
}