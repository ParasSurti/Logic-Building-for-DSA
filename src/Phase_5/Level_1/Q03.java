//Convert all characters of a string to uppercase.
package Phase_5.Level_1;

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
        String upper = str.toUpperCase();
        printUpp(upper,l - 1);
    }
    static void printUpp(String str, int index)
    {
        if(index < 0) return;
        printUpp(str,index - 1);
        System.out.print(str.charAt(index));
    }
}
