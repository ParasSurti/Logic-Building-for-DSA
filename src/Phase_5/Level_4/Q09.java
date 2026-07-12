//Swap case: uppercase → lowercase and lowercase → uppercase.
package Phase_5.Level_4;

import Phase_5.OneStringTemplate;

public class Q09 extends OneStringTemplate
{
    public static void main(String[] args)
    {
        Q09 q = new Q09();
        q.setup();
        q.solve();
    }

    @Override
    protected void solve()
    {
        String print = swap(str,l -1,0);
        System.out.println(print);
    }
    static String swap(String str, int index,int start)
    {
        if(start > index) return "";
        if(upperCase(str,start)) return str.toLowerCase().charAt(start) + swap(str,index, start + 1);
        else if(lowerCase(str,start)) return str.toUpperCase().charAt(start) + swap(str,index, start + 1);
        return str.charAt(start) + swap(str, index,start + 1);
    }
    static boolean upperCase(String str, int index)
    {
        return str.charAt(index) >= 'A' && str.charAt(index) <= 'Z';
    }
    static boolean lowerCase(String str, int index)
    {
        return str.charAt(index) >= 'a' && str.charAt(index) <= 'z';
    }
}
