//Find the minimum element in an array.
package Phase_4.Level_1;

import java.util.Scanner;

public class Q05
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = input.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = input.nextInt();
        }

        System.out.println("Smallest Element inside the array : " + Mini(arr,n - 1));
    }
    static int Mini( int[] arr , int n)
    {
        if(n < 0) return arr[0];
        return Math.min(arr[n],Mini(arr,n - 1));
    }
}
