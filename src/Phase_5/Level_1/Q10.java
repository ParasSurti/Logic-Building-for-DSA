// Check whether the string is empty or not.
package Phase_5.Level_1;

import Phase_5.OneStringTemplate;

public class Q10 extends OneStringTemplate
{
    public static void main(String[] args)
    {
        Q10 q = new Q10();
        q.setup();
        q.solve();
    }
    @Override
    protected void solve()
    {
        if(str.isEmpty())
        {
            System.out.println("The String is Empty! ");
        }
        else System.out.println("The String is not Empty! ");
    }
}
