//Find the longest word in a sentence.
package Phase_5.Level_5;

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
        System.out.println(longestWord(str));
    }

    static String longestWord(String str)
    {
        String[] words = str.split("\\s++");
        String longest = " ";
        for (int i = 0; i < words.length; i++  )
        {
            if(words[i].length() > longest.length())
            {
                longest = words[i];
            }
        }
        return longest;
    }
}