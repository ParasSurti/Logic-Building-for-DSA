//Count how many times a given character appears in a string.
package Phase_5.Level_2;

import java.util.Scanner;

public class Q06 extends StringTemplate
{
    public static void main(String[] args)
    {
        Q06 q = new Q06();
        q.setup();
        q.solve();
    }
    @Override
    void solve()
    {
        System.out.println("Enter the single Character : ");
        String ch = input.next();
        int time = count(str, ch.charAt(0), l - 1);
        System.out.println( "Character : "+ch +" has appear for " + time + " times!! in '" + str + "' " );
    }
    static int count(String str,char ch, int index)
    {
        if(index < 0) return 0;
        if(str.charAt(index) == ch) return 1 + count(str,ch,index - 1);
        return count(str,ch,index - 1);
    }
}
