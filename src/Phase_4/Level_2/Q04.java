//Find the last occurrence of a given number.
package Phase_4.Level_2;

import java.util.Scanner;

public class Q04
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = input.nextInt();

        System.out.print("Enter the Number (k) : ");
        int k = input.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = input.nextInt();
        }

        int occur = lastOccur(arr,n - 1,k);
        System.out.println("At " + occur + " is the last occurrence of a given number.");
    }
    static int lastOccur(int[] arr, int n, int k)
    {
        if(n < 0) return -1;
        if(arr[n] == k) return n;
        return lastOccur(arr,n -1 ,k);
    }
}
