//Swap first and last words in a sentence.
package Phase_5.Level_5;

import Phase_5.OneStringTemplate;

public class Q05 extends OneStringTemplate
{
    public static void main(String[] args)
    {
        Q05 q = new Q05();
        q.setup();
        q.solve();
    }
    @Override
    protected void solve()
    {
        String[] words = str.split("\\s+");
        swap(words,0,words.length - 1);
        for (int i = 0; i < words.length; i++)
        {
            System.out.print(words[i]);
            if (i != words.length - 1) {
                System.out.print(" ");
            }
        }
    }

    static void swap(String[] words ,int first, int last)
    {
        String temp = words[first];
        words[first] = words[last];
        words[last] = temp;
    }

}
