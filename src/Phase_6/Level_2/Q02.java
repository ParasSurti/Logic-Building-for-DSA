//Count vowels in each word of a sentence.
package Phase_6.Level_2;

import Phase_6.OneStringTemplate;

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
        int print = sentence(str,0);
    }
    static int sentence(String str, int i)
    {
        if(i == str.length()) return 0;
        if(i == str.length() - 1 || (str.charAt(i + 1) == ' ' && str.charAt(i) != ' '))
        {
            System.out.print(words(str,i,0) + " ");
        }
        return sentence(str,i + 1);
    }
    static int words(String str, int i, int sum)
    {
        if(i < 0 || str.charAt(i) == ' ' ) return sum;
        if(str.charAt(i) == 'a' || str.charAt(i) == 'e' ||
                str.charAt(i) == 'i' || str.charAt(i) == 'o'
                || str.charAt(i) == 'u')
        {
            sum += 1;
        }
        return words(str,i - 1, sum);
    }
}
