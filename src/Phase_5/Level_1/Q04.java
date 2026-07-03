//Convert all characters of a string to lowercase.
package Phase_5.Level_1;

public class Q04 extends StringTemplate
{
    public static void main(String[] args)
    {
        Q04 q = new Q04();
        q.setup();
        q.solve();
    }

    @Override
    void solve()
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
