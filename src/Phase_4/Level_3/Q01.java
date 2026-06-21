//Create a new array containing squares of all numbers.
package Phase_4.Level_3;

import java.util.Arrays;
import java.util.Scanner;

public class Q01
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

        int[] squared = new int[n];
        sq(arr,squared,n - 1);
//        for (int i = 0; i < n; i++)
//        {
//            System.out.println(empty[i]);
//        }

        System.out.println(Arrays.toString(squared));

    }
    static void sq(int[] arr,int[] squared, int n)
    {
        if( n < 0) return ;
        sq(arr,squared,n - 1);
        squared[n] = arr[n] * arr[n];
    }

}
