//Capitalize the first letter of each word.
package Phase_5.Level_5;

import Phase_6.OneStringTemplate;

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
        String print = sentence(str,0);
        System.out.println(print);
    }
    static String sentence(String str, int i)
    {
        if(i == str.length()) return "";
        return letter(str,i) + sentence(str, i + 1) ;
    }
    static char letter(String str, int i )
    {
        if(i == 0 || str.charAt(i - 1) == ' ')
        {
            return Character.toUpperCase(str.charAt(i));
        }
        return str.charAt(i);
    }
}
