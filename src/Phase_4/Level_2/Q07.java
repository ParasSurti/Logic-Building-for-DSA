// Find the sum of odd elements only.
package Phase_4.Level_2;

import java.util.Scanner;

public class Q07
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int n = input.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = input.nextInt();
        }

        int sum = 0;
        int oddSum = sum(arr,sum,n - 1);
        System.out.println("The Sum of the Odd Elements in Arrays : " + oddSum);
    }
    static int sum(int[] arr, int sum , int n)
    {
        if(n < 0) return 0;
        sum = sum(arr,sum,n - 1);
        if(arr[n] % 2 != 0)  sum += arr[n];
        return sum;
    }
}
