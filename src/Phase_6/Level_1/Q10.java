//Check if a number is perfect (sum of factors equals number).
package Phase_6.Level_1;

import Phase_6.NumberTemplate;

public class Q10 extends NumberTemplate
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
        boolean check = perfect(num);
        System.out.println(check);
    }
    static boolean perfect(int num)
    {
        return sum(num,1,0) == num;
    }
    static int sum(int num, int i, int sum)
    {
        if(i == num) return sum;
        if(count(num,i)) sum += i;
        return sum(num,i + 1,sum);
    }

    static boolean count(int num, int i)
    {
        return num % i == 0;
    }
}
