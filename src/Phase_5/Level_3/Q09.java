//Reverse only characters, keeping digits in place.
package Phase_5.Level_3;

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
        char[] ch = str.toCharArray();
        rev(str,ch,0, l - 1);
        System.out.println(new String(ch));

    }
    //will only print the rev string
    static String rev(String str,char[] ch, int left, int right)
    {
        if(left >= right) return " ";
        //checking if left or right is digit ??
        if(!isLeftLetter(ch,left)) return rev(str,ch,left + 1,right);
        else if(!isRightLetter(ch,right))return rev(str,ch,left,right - 1);
        else  swap(ch,left,right);
        return rev(str,ch,left + 1,right - 1);
    }
    static boolean isLeftLetter(char[] ch, int left)
    {
        return  (ch[left] >= 'a' && ch[left] <= 'z') || (ch[left] >= 'A' && ch[left] <= 'Z');
    }
    static boolean isRightLetter(char[] ch, int right)
    {
        return  (ch[right] >= 'a' && ch[right] <= 'z') || (ch[right] >= 'A' && ch[right] <= 'Z');
    }
    static void swap(char[] ch, int left, int right)
    {
        char temp = ch[left];
        ch[left] = ch[right];
        ch[right] = temp;
    }
}
