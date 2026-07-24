// Reverse words in a string if their length is even.
package Phase_6.Level_2;

import Phase_6.OneStringTemplate;

public class Q03 extends OneStringTemplate
{
    public static void main(String[] args)
    {
        Q03 q = new Q03();
        q.setup();
        q.solve();
    }
    @Override
    protected void solve()
    {
        String print = even(str,0);
        System.out.println(print);
    }
    static String even(String str, int i)
    {
        if (i == str.length()) return "";
        if(i == str.length() - 1 || (str.charAt(i + 1) == ' ' && str.charAt(i) != ' '))
        {
            if(words(str,i,0) % 2 == 0)
            {
                return rev(str,i) + " " +even(str,i + 1);
            }
            else return nor(str,i) + " " +even(str,i + 1);
        }
        return even(str,i + 1);
    }
    static int words(String str, int i, int sum)
    {
        if(i < 0 || str.charAt(i) == ' ') return sum;
        sum += 1;
        return words(str,i - 1,sum);
    }
    static String rev(String str, int i)
    {
        if(i < 0 || str.charAt(i) == ' ') return "";
        return str.charAt(i) + rev(str,i - 1) ;
    }
    static String nor(String str, int i)
    {
        if(i < 0 || str.charAt(i) == ' ') return "";
        return nor(str,i - 1) + str.charAt(i);
    }
}
