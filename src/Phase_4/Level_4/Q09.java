//Create a frequency array of numbers (count occurrence of each number).
package Phase_4.Level_4;

import java.util.Scanner;

public class Q09
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of Arrays : ");
        int n = input.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = input.nextInt();
        }
        //size of array
        int size = maximumElement(arr,n - 1, 0) + 1;
        int[] arr2 = new int[size];
        //count the occurrence
        occurrence(arr,arr2, n - 1);
    }
    static int maximumElement(int[] arr, int n, int store)
    {
        if(n < 0) return store;
        store = Math.max(arr[n],store);
        return maximumElement(arr, n - 1, store);
    }
    static void occurrence(int[] arr, int[] arr2, int n)
    {
        if(n < 0) return;
        arr2[arr[n]] = arr2[arr[n]] + 1;  // increment the count at that number's index
        occurrence(arr, arr2, n - 1);
    }
}