//Check if two strings are the reverse of each other.
package Phase_5.Level_3;

import Phase_5.TwoStringTemplate;

public class Q05 extends TwoStringTemplate
{
    public static void main(String[] args)
    {
        Q05 q = new Q05();
        q.setup();
        q.solve();
    }
    @Override
    protected void solve()
    {
        boolean check = both(str1,str2,l2 - 1);

        if(check) System.out.println("String 1 : " + str1 +" \nString 2 : " + str2 + "\n!! Both are reverse of each other !!");
        else System.out.println("String 1 : " + str1 +" \n String 2 : " + str2 + "\n!! Both are not reverse of each other !!");
    }
    static boolean both(String str1, String str2, int index2)
    {
         return str1.equals(rev(str2,index2));
    }
    static String rev(String str2, int index2)
    {
        if(index2 < 0) return "";
        return str2.charAt(index2) + rev(str2,index2 - 1);
    }
}
