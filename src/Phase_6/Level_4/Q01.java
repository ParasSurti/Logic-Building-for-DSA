//Print a multiplication table in a formatted grid (10x10).
package Phase_6.Level_4;

import Phase_6.NumberTemplate;

public class Q01 extends NumberTemplate
{
    public static void main(String[] args) {
        Q01 q = new Q01();
        q.setup();
        q.solve();
    }
    @Override
    protected void solve()
    {
        multi(num,1);
    }
    static void multi(int num, int i)
    {
        if(i > 10) return ;
        System.out.println(num + " x " + i + " = " + (num * i));
        multi(num,i + 1);
    }

}
