//Find the sum of all elements in an array.
package Phase_4.Level_1;

import java.util.Scanner;

public class Q02
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of Elements : ");
        int n = input.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = input.nextInt();
        }
        System.out.println("The sum of the elements in arrays is " + printSum(0,arr,n - 1));

    }
    public static int printSum(int sum , int[] arr , int n)
    {
        if(n < 0 ) return sum;
        sum = printSum(sum,arr,n - 1);
        sum += arr[n];
        return sum;
    }
}
