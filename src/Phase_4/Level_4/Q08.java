//Find element-wise product of two arrays.
package Phase_4.Level_4;

import java.util.Arrays;

public class Q08 extends ArrayTemplate
{
    public static void main(String[] args)
    {
        Q08 q = new Q08();
        q.setup();
        q.solve();
    }

    @Override
    void solve()
    {
        int[] arr3 = new int[n];
        Product(arr1,arr2,arr3,n - 1);
        System.out.println("Element-wise product of two arrays : " + Arrays.toString(arr3));
    }
    static void Product(int[] arr1, int[] arr2, int[] arr3, int n)
    {
        if(n < 0 ) return ;
        arr3[n] = arr1[n] * arr2[n];
        Product(arr1,arr2,arr3,n - 1);
    }
}
