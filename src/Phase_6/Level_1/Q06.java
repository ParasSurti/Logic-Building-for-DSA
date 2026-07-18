//Count how many even digits a number contains.
package Phase_6.Level_1;

import Phase_6.NumberTemplate;

public class Q06 extends NumberTemplate
{
    public static void main(String[] args)
    {
        Q06 q = new Q06();
        q.setup();
        q.solve();
    }
    @Override
    protected void solve() {
        if (num == 0)
        {

            System.out.println(1);
            return;
        }
        int count = even(num,0,0);
        System.out.println(count);
    }
    static int even(int num, int count, int store)
    {
        if(num == 0) return count;
        store = num % 10;
        if(store % 2 == 0) count += 1;
        return even(num / 10,count,store);
    }
}
