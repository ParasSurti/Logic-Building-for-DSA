//Find the sum of digits of a number (use loop).
package Phase_6.Level_1;

import Phase_6.NumberTemplate;

public class Q02 extends NumberTemplate
{
    public static void main(String[] args)
    {
        Q02 q = new Q02();
        q.setup();
        q.solve();
    }
    @Override
    protected void solve()
    {
        int sum = 0;
        for (int i = 0; i < num; i++)
        {
            sum += num % 10;
            num /= 10;
        }
        System.out.println(sum);
    }
}
