// Count how many words end with ‘s’.
package Phase_5.Level_2;

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
        int end = count(str,0);
        System.out.println("There are total " + end + " words which ends with 's' !!");
    }
    static int count(String str, int i)
    {
        if(i == str.length()) return 0;
        char ch = Character.toLowerCase(str.charAt(i));
        if(isEnd(str,i) && endWith(ch))
        {
            return count(str,i + 1) + 1;
        }
        return count(str,i +1);
    }
    static boolean isEnd(String str, int i )
    {
        return i == str.length() - 1 || str.charAt(i + 1) == ' ';
    }
    static boolean endWith(char ch)
    {
        return ch == 's';
    }
}
