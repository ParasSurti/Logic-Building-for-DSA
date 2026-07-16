//Print all numbers between 1 and N that are divisible by both 3 and 5.
package Phase_6.Level_1;

import Phase_6.NumberTemplate;

import java.util.Scanner;

public class Q01 extends NumberTemplate
{
    public static void main(String[] args)
    {
        Q01 q = new Q01();
        q.setup();
        q.solve();
    }
    @Override
    protected void solve()
    {
        div(1,num);
    }
    static void div(int start, int end)
    {
        if(start > end) return ;
        if(divby3(start,end) && divby5(start,end)) System.out.print(start + " ");
        div(start + 1,end);
    }
    static boolean divby3(int start, int end)
    {
         return start % 3 == 0;
    }
    static boolean divby5(int start, int end)
    {
        return start % 5 == 0;
    }
}
