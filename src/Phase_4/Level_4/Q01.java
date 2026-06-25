//Compare two arrays — check if they are equal (same elements & order).
package Phase_4.Level_4;

import java.util.Arrays;
import java.util.Scanner;

public class Q01 extends ArrayTemplate
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
        boolean check = cmp(arr1,arr2,n - 1);
        if(!check)
    }
    static boolean cmp(int[] arr1, int[] arr2, int n)
    {
        if(n < 0) return true;
        if(arr1[n] != arr2[n]) return false;
        return cmp(arr1,arr2,n - 1);
    }
}
