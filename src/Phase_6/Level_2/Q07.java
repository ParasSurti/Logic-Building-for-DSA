//Toggle case for every alternate word in a sentence.
package Phase_6.Level_2;

import Phase_6.OneStringTemplate;

public class Q07 extends OneStringTemplate
{
    public static void main(String[] args) {
        Q07 q = new Q07();
        q.setup();
        q.solve();
    }
    @Override
    protected void solve()
    {
        String print = toggle(str,0,0);
        System.out.println(print);
    }
    static String toggle(String str, int i,int words)
    {
        if(i >= str.length()) return "";
        char ch = str.charAt(i);
        if(words % 2 == 0 && ch != ' ')
        {
            if(Character.isLowerCase(ch))
            {
                ch = Character.toUpperCase(ch);
            }
            else
            {
                ch = Character.toLowerCase(ch);
            }
        }
        if(ch == ' ')
        {
            words++;
        }
        return ch + toggle(str,i + 1,words);
    }
//
//    static String upperCase(String words,int i)
//    {
//        if(i >= words.length()) return "";
//        char ch = Character.toUpperCase(words.charAt(i));
//        return ch + upperCase(words,i + 1);
//    }
//
//    static String lowerCase(String words,int i)
//    {
//        if(i >= words.length()) return "";
//        char ch = Character.toLowerCase(words.charAt(i));
//        return ch + lowerCase(words,i + 1);
//    }
}
