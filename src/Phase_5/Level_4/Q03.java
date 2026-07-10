//Replace all vowels with ‘*’.
package Phase_5.Level_4;

import Phase_5.OneStringTemplate;

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
        String print = replace(str,l - 1);
        System.out.println(print);
    }
    static String replace(String str, int index)
    {
        if(index < 0) return "";
        if(vowel(str,index)) return replace(str,index - 1) + "*";
        return replace(str,index - 1) + str.charAt(index);
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
