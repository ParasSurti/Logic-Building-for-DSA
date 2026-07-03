//Count how many characters (excluding spaces) are in the string.
package Phase_5.Level_1;

public class Q05 extends StringTemplate
{
    public static void main(String[] args)
    {
        Q05 q = new Q05();
        q.setup();
        q.solve();
    }

    @Override
    void solve()
    {
        int character = count(str,l - 1);
        System.out.println("There are total '" + character + "' characters (excluding spaces) are in the string. ");
    }
    static int count(String str, int index)
    {
        if(index < 0) return 0;
        if(str.charAt(index) != ' ')
        {
            return 1 + count(str,index - 1);
        }
        return count(str,index - 1);
    }
}
