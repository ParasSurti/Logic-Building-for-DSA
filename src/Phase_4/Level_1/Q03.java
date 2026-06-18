//Find the average of array elements.
package Phase_4.Level_1;

import java.util.Scanner;

public class Q03
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int n = input.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n ; i++)
        {
            arr[i] = input.nextInt();
        }

        System.out.println("The Average of all the elements inside the array : " + printAvg(printSum(0,arr,n - 1), n ));
    }
    static int printSum(int sum, int[] arr, int n)
    {
        if(n < 0) return sum;
        sum = printSum(sum,arr,n - 1);
        sum += arr[n];
        return sum;
    }
    static int printAvg(int sum, int n )
    {
        return  sum / n;
    }
}
