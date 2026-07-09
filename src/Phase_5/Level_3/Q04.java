//Check whether a string is a palindrome.
package Phase_5.Level_3;

import Phase_5.StringTemplate;

public class Q04 extends StringTemplate
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
        boolean check = palindrome(str,l - 1,0);
        if(check) System.out.println(str + ", is Palindrome.");
        else System.out.println(str + ", is not Palindrome.");

    }
    static boolean  palindrome(String str, int index,int start)
    {
        if(start >= index) return true;
        char start_ch = Character.toLowerCase(str.charAt(start));
        char end_ch = Character.toLowerCase(str.charAt(index));
        if(start_ch != end_ch)
        {
            return false;
        }
        return palindrome(str,index  - 1 , start + 1);
    }
}
