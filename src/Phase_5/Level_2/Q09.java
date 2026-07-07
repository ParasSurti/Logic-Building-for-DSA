//Print how many words start with a vowel in a sentence.
package Phase_5.Level_2;

import Phase_5.StringTemplate;

public class Q09 extends StringTemplate
{
    public static void main(String[] args)
    {
        Q09 q = new Q09();
        q.setup();
        q.solve();
    }
    @Override
    protected void solve()
    {
        //A, E, I, O, U
        int count = count(str,0);
        System.out.println("There are total " + count + " words start with a vowel in this sentence.");
    }
    static int count(String str, int i)
    {
        if(i == str.length()) return 0;
        char ch = Character.toLowerCase(str.charAt(i));
        if(isStartWord(str,i) && isVowel(ch))
        {
            return count(str,i + 1) + 1;
        }
        return count(str,i + 1);
    }
    static boolean isStartWord(String str, int i)
    {
        return i == 0 || str.charAt(i - 1) == ' ' ;
    }
    static boolean isVowel(char ch)
    {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
