//Count how many words have even length.
package Phase_5.Level_5;

import Phase_5.OneStringTemplate;

public class Q02 extends OneStringTemplate
{
    public static void main(String[] args)
    {
        Q02 q = new Q02();
        q.setup();
        q.solve();
    }

    @Override
    protected void solve()
    {
        int print = count(str,l - 1,0,0);
        System.out.println(print);
    }

    static int count(String str, int index, int i, int sum)
    {
        if (i > index) return sum;
        if(wordCount(str, index, i, 0) % 2 == 0)
        {
            sum += 1;
        }
        return count(str,index,i + wordCount(str,index,i, 0) + 1,sum);
    }
    static int wordCount(String str, int index, int i , int count)
    {
        if(i > index) return count;
        if(str.charAt(i) == ' ') return count;
        return wordCount(str,index,i + 1, count +1 );
    }

}