//Find element-wise sum of two arrays (A[i] + B[i]).
package Phase_4.Level_4;

import java.util.Arrays;

public class Q07 extends ArrayTemplate
{
    public static void main(String[] args)
    {
        Q07 q = new Q07();
        q.setup();
        q.solve();
    }
    @Override
    void solve()
    {
        int[] arr3 = new int[n];
        sum(arr1,arr2,arr3,n - 1);
        System.out.println("Element-wise sum of two arrays (A[i] + B[i]) : " + Arrays.toString(arr3));
    }
    static void sum(int[] arr1, int[] arr2, int[] arr3, int n)
    {
        if(n < 0) return ;
        arr3[n] = arr1[n] + arr2[n];
        sum(arr1,arr2,arr3,n - 1);
    }
}
