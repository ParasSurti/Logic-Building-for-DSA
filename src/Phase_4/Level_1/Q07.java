//Count how many elements are even and odd.
package Phase_4.Level_1;

import java.util.Scanner;

public class Q07
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

        //Recursion Method...
        int even  = even(0, arr, n - 1);
        int odd = n - even;

        System.out.println("Total Even Number : " + even + "\nTotal Odd Number : " + odd);
    }
    static int even(int even , int[] arr, int n)
    {
        if(n < 0) return even;
        even = even(even, arr, n - 1);
        if( arr[n] % 2 == 0 ) even++;
        return even;
    }
}
