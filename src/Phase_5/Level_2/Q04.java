//Find the frequency of each character in a string (without using a map).
package Phase_5.Level_2;

import Phase_5.OneStringTemplate;

public class Q04 extends OneStringTemplate
{
    public static void main(String[] args)
    {
        Q04 q = new Q04();
        q.setup();
        q.solve();
    }
    @Override
    protected void solve()
    {
         feq(str,l - 1);
    }
    static void feq(String str, int index)
    {
        if(index < 0) return;
        char ch = Character.toLowerCase(str.charAt(index));
        if(!alreadySeen(str,index - 1,ch))
        {
            System.out.println("character : " + ch + " index : " + countnum(str,str.length() - 1,ch));
        }
        feq(str,index - 1);
    }
    static int countnum(String str, int index, char ch)
    {
        if(index < 0) return 0;
        if(ch == str.charAt(index)) return countnum(str,index - 1, ch) + 1;
        return countnum(str,index - 1,ch);
    }
    static boolean alreadySeen(String str, int index, char ch)
    {
        if(index < 0) return false;
        if(ch == str.charAt(index)) return true;
        return alreadySeen(str,index -1 ,ch);
    }
}