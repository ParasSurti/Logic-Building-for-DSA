//Count how many uppercase and lowercase letters a string has.
package Phase_5.Level_2;

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
        int lower = countLower(str, l - 1);
        int upper = countUpper(str, l - 1);
        System.out.println("There are total " + lower + " Lowercase letter!! ");
        System.out.println("There are total " + upper + " Uppercase letter!! ");
    }
    static int countLower(String str, int index)
    {
        if(index < 0) return 0;
        char ch = str.charAt(index);
        if(isLower(ch))
        {
            return countLower(str,index - 1)+1;
        }
        return countLower(str,index - 1);
    }
    static int countUpper(String str, int index)
    {
        if(index < 0) return 0;
        char ch = str.charAt(index);
        if(isUpper(ch)) return countUpper(str,index - 1) + 1;
        return countUpper(str,index - 1);
    }
    static boolean isLower(char ch)
    {
        return ch >= 'a' && ch <= 'z';
    }
    static boolean isUpper(char ch) {return ch >= 'A' && ch <= 'Z';}
}
