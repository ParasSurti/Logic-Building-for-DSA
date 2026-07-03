//Print the first and last character of a string.
package Phase_5.Level_1;

public class Q02 extends StringTemplate
{
    public static void main(String[] args)
    {
        Q02 q = new Q02();
        q.setup();
        q.solve();
    }
    @Override
    void solve()
    {
        if(l == 0)
        {
            System.out.println("The string is empty.");
            return;
        }
        print(str,l - 1,l - 1);
    }
    static void print(String str, int index, int n)
    {
        if(index < 0) return;
        print(str, index - 1, n);
        if(index == 0) System.out.println("The First Character : " + str.charAt(index));
        if(index == n) System.out.println("The Last  Character : " + str.charAt(index));

    }
}
