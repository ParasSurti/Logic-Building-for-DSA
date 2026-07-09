//Count how many words are in a sentence.
package Phase_5.Level_1;

import Phase_5.OneStringTemplate;

public class Q06 extends OneStringTemplate
{
    public static void main(String[] args)
    {
        Q06 q = new Q06();
        q.setup();
        q.solve();
    }
    @Override
    protected void solve()
    {
        int words = count(str,l - 1, 0);
        System.out.println(words);
    }
    static int count(String str, int index, int count)
    {
        if(index < 0) return count;
        if(str.charAt(index) != ' ' &&
                index == 0 || str.charAt(index - 1) == ' ')
        {
            count += 1;
        }
        return count(str, index - 1, count);
    }
}
