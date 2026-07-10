//Reverse string but skip spaces.
package Phase_5.Level_3;

import Phase_5.OneStringTemplate;

public class Q10 extends OneStringTemplate
{
    public static void main(String[] args)
    {
        Q10 q = new Q10();
        q.setup();
        q.solve();
    }
    @Override
    protected void solve()
    {
        char[] ch = str.toCharArray();
        String print = rev(ch,0,l -1);
        System.out.println(new String(ch));
    }
    static String rev(char[] ch,int left,int right)
    {
        if(left >= right) return  "";
        if(ch[left] == ' ') return rev(ch,left + 1,right);
        else if(ch[right] == ' ') return rev(ch,left,right - 1);
        else swap(ch,left,right);
        return rev(ch,left + 1,right - 1);
    }
    static void swap(char[] ch, int left, int right)
    {
        char temp = ch[left];
        ch[left] = ch[right];
        ch[right] = temp;
    }
}
