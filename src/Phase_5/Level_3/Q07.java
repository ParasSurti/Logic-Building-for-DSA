//Print the second half of the string in reverse.
package Phase_5.Level_3;

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
        String print = secondHalf(str,l/2,0);
        System.out.println(print);
    }

    static String secondHalf(String str, int length, int index)
    {
        if(index >= str.length()) return "";
        if(index >= length) return rev(str,index,str.length());
        return secondHalf(str,length , index + 1);
    }
    static String rev(String str, int index,int length)
    {
        if(index >= length) return "";
        return rev(str,index + 1,length) + str.charAt(index);
    }



}
