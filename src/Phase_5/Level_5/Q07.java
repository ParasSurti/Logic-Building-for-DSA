//Count how many words contain the letter ‘a’.
package Phase_5.Level_5;

import Phase_5.OneStringTemplate;

public class Q07 extends OneStringTemplate
{
    public static void main(String[] args)
    {
        Q07 q = new Q07();
        q.setup();
        q.solve();
    }
    @Override
    protected void solve()
    {
        int a = count(str,0,l - 1, 0);
        System.out.println("Total word that contain the letter 'a' :- " + a);
    }
    static int count(String str, int i, int length, int count)
    {
        if(i > length) return count;
        if(i == length || str.charAt(i + 1) == ' ')
        {
            count += word(str,i);
        }
        return count(str,i + 1,length,count);
    }
    static int word(String str, int i)
    {
        if(i < 0 || str.charAt(i) == ' ') return 0;
        if(str.charAt(i) == 'a') return 1;
        return word(str,i - 1);
    }

}
