//Count how many substrings start and end with the same character (simple logic).
package Phase_5.Level_2;

import Phase_5.OneStringTemplate;

public class Q08 extends OneStringTemplate
{
    public static void main(String[] args)
    {
        Q08 q = new Q08();
        q.setup();
        q.solve();
    }
    @Override
    protected void solve()
    {
        int count = words(str,0,l - 1);
        System.out.println(count);
    }
    static int words(String str,int i, int index)
    {
        if(i > index) return 0;
        return checkj(str,i,i,index) + words(str,i+1,index);
    }
    static int checkj(String str, int i , int j , int index)
    {
        if(j > index) return 0;
        if(str.charAt(i) == str.charAt(j))
        {
            return checkj(str,i,j + 1,index) + 1;
        }
        return checkj(str,i,j + 1,index);
    }
}
