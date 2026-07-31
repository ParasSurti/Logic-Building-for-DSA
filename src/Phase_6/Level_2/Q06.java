//Count words that start and end with the same letter.
package Phase_6.Level_2;

import Phase_6.OneStringTemplate;

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
        String[] words = str.split("\\s++");
        int count = sameLetter(words,0,0);
        System.out.println(count);
    }
    static int sameLetter(String[] words,int start, int count)
    {
        if(start >= words.length) return count;
        String str = words[start];
        if(check(str))
        {
            count++;
        }
        return sameLetter(words,start+1,count);
    }
    static boolean check(String str)
    {
        return str.charAt(0) == str.charAt(str.length() - 1);
    }
}
