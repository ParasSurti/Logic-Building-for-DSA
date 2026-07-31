//Replace every vowel in a string with its position (a=1, e=2...).
// a, e, i, o, u,
package Phase_6.Level_2;

import Phase_6.OneStringTemplate;

public class Q04 extends OneStringTemplate
{
    public static void main(String[] args) {
        Q04 q = new Q04();
        q.setup();
        q.solve();
    }
    @Override
    protected void solve()
    {
        String print = vowel(str,0);
        System.out.println(print);
    }
    static String vowel(String str,int start)
    {
        if(start >= str.length()) return "";
        char ch = str.charAt(start);
        if(check(ch))
        {
            return swapNum(ch) + vowel(str,start + 1);
        }
        return str.charAt(start) + vowel(str,start + 1);
    }
    static boolean check(char ch)
    {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    static int swapNum(char ch)
    {
        if(ch == 'a')
        {
            return 1;
        }
        else if(ch == 'e')
        {
            return 2;
        }
        else if(ch == 'i')
        {
            return 3;
        }
        else if(ch == 'o')
        {
            return 4;
        }
        return 5;
    }
}
