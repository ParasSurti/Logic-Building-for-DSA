//Find the shortest word in a sentence.
package Phase_5.Level_5;

import Phase_5.OneStringTemplate;

public class Q04 extends OneStringTemplate
{
    public static void main(String[] args)
    {
        Q04 q  = new Q04();
        q.setup();
        q.solve();
    }
    @Override
    protected void solve()
    {
        System.out.println(smallest(str));
    }
    static String smallest(String str)
    {
        String[] words = str.split("\\s++");
        String word = words[0];
        for (int i = 0; i < words.length; i++)
        {
            if(word.length() > words[i].length())
            {
                word = words[i];
            }
        }
        return word;
    }

}
