// Check whether the string is empty or not.
package Phase_5.Level_1;

public class Q10 extends StringTemplate
{
    public static void main(String[] args)
    {
        Q10 q = new Q10();
        q.setup();
        q.solve();
    }
    @Override
    void solve()
    {
        if(str.isEmpty())
        {
            System.out.println("The String is Empty! ");
        }
        else System.out.println("The String is not Empty! ");
    }
}
