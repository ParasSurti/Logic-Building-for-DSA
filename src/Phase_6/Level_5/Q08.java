//Print characters that are common in two strings.
package Phase_6.Level_5;

import Phase_5.TwoStringTemplate;

import java.util.ArrayList;

public class Q08 extends TwoStringTemplate
{
    public static void main(String[] args)
    {
        Q08 q = new Q08();
        q.setup();
        q.solve();
    }
    @Override
    protected void solve()
    {
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        ArrayList<Character> store = new ArrayList<>();
        for (int i = 0; i < ch1.length; i++)
        {
            for (int j = 0; j < ch2.length; j++)
            {
                if(ch1[i] == ch2[j])
                {
                    store.add(ch1[i]);
                }
            }
        }

        System.out.println(store);
    }
}
