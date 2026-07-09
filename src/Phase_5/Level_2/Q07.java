//Count how many alphabets are before ‘m’ and after ‘m’ in a given string.
package Phase_5.Level_2;

import Phase_5.OneStringTemplate;

public class Q07 extends OneStringTemplate
{
    public static void main(String[] args)
    {
        Q07 q = new Q07();
        q.setup();
        q.solve();
    }
    @Override
    protected void solve()
    {
        int before = beforeCount(str,l - 1);
        int after = afterCount(str,l - 1);
        System.out.println("Total Before Character : " + before );
        System.out.println("Total After Character : " + after);
    }
    static int beforeCount(String str,int index)
    {
        if(index < 0) return 0;
        char ch = Character.toLowerCase(str.charAt(index));
        if(ch >= 'a' && ch <= 'z')
        {
            if(ch < 'm') return beforeCount(str,index - 1) + 1;
        }
        return beforeCount(str,index - 1);
    }
    static int afterCount(String str,int index)
    {
        if(index < 0) return 0;
        char ch = Character.toLowerCase(str.charAt(index));
        if(ch >= 'a' && ch <= 'z')
        {
            if (ch > 'm') return afterCount(str, index - 1) + 1;
        }
        return afterCount(str,index - 1);
    }
}
