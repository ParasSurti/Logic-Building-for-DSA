//Remove all vowels from a string.
package Phase_5.Level_4;

import Phase_5.OneStringTemplate;

public class Q01 extends OneStringTemplate
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
        String print = printCon(str,l - 1);
        System.out.println(print);
    }
    static String printCon(String str, int index)
    {
        if(index < 0) return "";
        if(vowel(str,index)) return printCon(str,index - 1);
        return printCon(str,index - 1) + str.charAt(index);
    }
    static boolean vowel(String str, int index)
    {
        return str.charAt(index) == 'a' || str.charAt(index) == 'A'
                || str.charAt(index) == 'e' || str.charAt(index) == 'E'
                || str.charAt(index) == 'i' || str.charAt(index) == 'I'
                || str.charAt(index) == 'o' || str.charAt(index) == 'O'
                || str.charAt(index) == 'u' || str.charAt(index) == 'U';
    }
}
