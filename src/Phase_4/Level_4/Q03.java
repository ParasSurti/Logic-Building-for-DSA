//Merge two arrays into a third array.
package Phase_4.Level_4;

import java.util.Arrays;
import java.util.Scanner;

public class Q03
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the Arrays : ");
        int n = input.nextInt();

        //First Array
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr1[i] = input.nextInt();
        }

        //Second Array
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr2[i] = input.nextInt();
        }

        int merge_n = n * 2;
        int[] merge_arr = new int[merge_n];
        merge(arr1,arr2,merge_arr, n - 1);
        System.out.println(Arrays.toString(merge_arr));
    }
    static void merge(int[] arr1, int[] arr2,int[] merge, int n)
    {
        if(n < 0 ) return ;
        fillArr1(arr1,merge,n);
        fillArr2(arr2,merge,n);
        merge(arr1, arr2, merge, n - 1);
    }
    static void fillArr1(int[] arr,int[] merge,int n)
    {
        if(n < 0) return ;
        merge[n] = arr[n];
    }
    static void fillArr2(int[]arr, int[] merge, int n)
    {
        if(n < 0) return;
        merge[n + arr.length] = arr[n];
    }
}
