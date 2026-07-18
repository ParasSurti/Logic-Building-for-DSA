//Find the factorial of a number using recursion.
package Phase_6.Level_1;

import Phase_6.NumberTemplate;

public class Q05 extends NumberTemplate
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
        int fact = print(num,1);
        System.out.println(fact);
    }
    static int print(int num, int fact)
    {
        if(num < 1) return fact;
        fact *= num ;
        return print(num - 1, fact);
    }
}
