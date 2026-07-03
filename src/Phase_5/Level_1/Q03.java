//Convert all characters of a string to uppercase.
package Phase_5.Level_1;

public class Q03 extends StringTemplate
{
    public static void main(String[] args)
    {
        Q03 q = new Q03();
        q.setup();
        q.solve();
    }
    @Override
    void solve()
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
