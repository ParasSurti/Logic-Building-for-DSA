//Take n elements and print only those greater than a given value k.
package Phase_4.Level_1;

import java.util.Scanner;

public class Q10
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of arrays : ");
        int n = input.nextInt();

        System.out.print("Enter the K value : ");
        int k = input.nextInt();


        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = input.nextInt();
        }

        int value = value(arr,k , n - 1);
    }
    static int value (int[] arr, int k , int n )
    {
        if(n < 0) return 0;
        int num = value(arr,k,n - 1);
        if(arr[n] > k)
        {
            System.out.println(arr[n]);
        }
        return n;
    }
}
