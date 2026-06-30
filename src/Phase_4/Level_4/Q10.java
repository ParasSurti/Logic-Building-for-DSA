//Print all elements that appear more than once.
package Phase_4.Level_4;

import java.util.Scanner;

public class Q10
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = input.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = input.nextInt();
        }
        //arr2 size
        int size = maxElement(arr,n - 1,0) + 1;
        int[] arr2 = new int[size];
        //arr2 fill
        occurrence(arr,arr2,arr2.length - 1,n - 1);
        //arr2 print
        print(arr,arr2,arr2.length - 1);
    }
    static int maxElement(int[] arr, int n, int count)
    {
        if(n < 0) return count;
        count = Math.max(arr[n],count);
        return maxElement(arr,n-1, count);
    }
    static void occurrence(int[] arr, int[] arr2,int arr2_n, int n)
    {
        if(n < 0) return ;
        arr2[arr[n]] = arr2[arr[n]] + 1;
        occurrence(arr,arr2,arr2_n,n - 1);
    }
    static void print(int[] arr,int[] arr2, int arr2_n)
    {
        if(arr2_n < 0 ) return;
        if(arr2[arr2_n] > 1)
        {
            System.out.print(arr2_n + " ");
        }
        print(arr,arr2,arr2_n - 1);
    }

}
