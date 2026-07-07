//Print the ASCII value of each character in a string.
package Phase_5.Level_1;

import Phase_5.StringTemplate;

public class Q09 extends StringTemplate
{
    public static void main(String[] args) {
        Q09 q = new Q09();
        q.setup();
        q.solve();
    }
    @Override
    protected void solve()
    {
        print(str,l - 1);
    }
    static void print(String str, int l)
    {
        if(l < 0) return;
        print(str,l - 1);
        System.out.println((int) str.charAt(l));
//        System.out.println(str.charAt(l) + 0);
    }
}
