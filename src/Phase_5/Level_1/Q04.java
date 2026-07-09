//Convert all characters of a string to lowercase.
package Phase_5.Level_1;

import Phase_5.OneStringTemplate;

public class Q04 extends OneStringTemplate
{
    public static void main(String[] args)
    {
        Q04 q = new Q04();
        q.setup();
        q.solve();
    }

    @Override
    protected void solve()
    {
        String lower = str.toLowerCase();
        printLower(lower,l - 1);
    }
    static void printLower(String lower, int index)
    {
        if(index < 0) return;
        printLower(lower, index - 1);
        System.out.print(lower.charAt(index));
    }
}
