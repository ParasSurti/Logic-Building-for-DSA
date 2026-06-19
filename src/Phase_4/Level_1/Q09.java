//Find the index of the minimum element.
package Phase_4.Level_1;

import java.util.Scanner;

public class Q09
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Size of array : ");
        int n = input.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
             arr[i] = input.nextInt();
        }

        //recursion Method....
        int minIndex = minIndex(arr,n - 1);
        System.out.println("There Min Index of Element : " + minIndex);
        System.out.println("Minimum of Element : " + arr[minIndex]);
    }
    static int minIndex(int[] arr, int n)
    {
        if(n == 0) return 0;
        int prev = minIndex(arr,n - 1);
        if(arr[n] < arr[prev])
            return n;
        else
            return prev;
    }
}
