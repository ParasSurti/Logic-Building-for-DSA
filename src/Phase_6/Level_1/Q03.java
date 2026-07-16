//Check if a number is an Armstrong number.
package Phase_6.Level_1;

import Phase_6.NumberTemplate;

public class Q03 extends NumberTemplate
{
    public static void main(String[] args)
    {
        Q03 q = new Q03();
        q.setup();
        q.solve();
    }
    @Override
    protected void solve()
    {
        boolean flag = check(num,countNum(num));
        if(flag) System.out.println( num + " is Armstrong Number!!");
        else System.out.println(num + " is not Armstrong Number !! ");
    }
    static int countNum(int num)
    {
        if(num == 0) return 0;
        return countNum(num / 10) + 1;
    }
    static int armstrong(int num, int digit, int sum, int total)
    {
        if(num == 0) return total;
        sum = num % 10;
        total += power(sum,digit,0,1);
        return armstrong(num / 10,digit,sum,total);
    }
    static int power(int sum, int digit, int count, int store )
    {
        if(count >= digit) return store;
        store *= sum;
        return power(sum,digit,count + 1,store);
    }
    static boolean check(int num, int digit)
    {
        return num == armstrong(num,digit,0,0);
    }

}
