//Merge two arrays into a third array.
package Phase_4.Level_4;

import java.util.Arrays;
import java.util.Scanner;

public class Q03 extends ArrayTemplate
{

    public static void main(String[] args)
    {
        Q03 q = new Q03();
        q.setup();
        q.solve();
    }

    @Override
    void solve()
    {
        int[] arr3 = new int[n * 2];
        merge(arr1,arr2,arr3,n - 1,arr3.length - 1);
        System.out.println("Merged Both Arrays : " + Arrays.toString(arr3));
    }
    static void merge(int[] arr1, int[] arr2,int[] arr3, int n, int length)
    {
        if(n < 0) return;
        arr3[n] = arr1[n];
        arr3[length] = arr2[n];
        merge(arr1,arr2,arr3,n - 1, length - 1);


    }
}
