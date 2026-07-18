//Print the reverse of a number (123 → 321).
package Phase_6.Level_1;

import Phase_6.NumberTemplate;

public class Q08 extends NumberTemplate
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
        int reverse = rev(num,0);
        System.out.println(reverse);
    }
    static int rev(int num, int fact)
    {
        if(num == 0) return fact;
        fact *= 10;
        fact += (num % 10);
        return rev(num / 10, fact);
    }
}
