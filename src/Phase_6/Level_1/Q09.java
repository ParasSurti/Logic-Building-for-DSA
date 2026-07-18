//Check if a number is palindrome (121 → true).
package Phase_6.Level_1;

import Phase_6.NumberTemplate;

public class Q09 extends NumberTemplate
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
        boolean check = pali(num, rev(num,0));
        if(check) System.out.println(num + " is a palindrome number !!");
        else System.out.println(num + " is not a palindrome number !!");
    }
    static boolean pali(int num, int rev)
    {
        return num == rev;
    }
    static int rev(int num, int store)
    {
        if(num == 0) return store;
        store *= 10;
        store += num % 10;
        return rev(num/10,store);
    }
}
