//Take a string input and print its length.
package Phase_5.Level_1;

import java.util.Scanner;

public class Q01 extends StringTemplate
{
    public static void main(String[] args)
    {
        Q01 q = new Q01();
        q.setup();
        q.solve();
    }
    @Override
    void solve()
    {
        System.out.println("The String : " + str);
        System.out.println("String Length : " + l);
    }
}
