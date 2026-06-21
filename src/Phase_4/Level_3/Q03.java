//Replace every negative number with 0.
package Phase_4.Level_3;

import java.util.Arrays;
import java.util.Scanner;

public class Q03
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the arrays : ");
        int n = input.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = input.nextInt();
        }
        int count = countPositive(arr,n - 1);
        System.out.println("Total Positive elements : " + count);
        int[] posArr = new int[n];
        positiveArr(arr,posArr,n - 1);
        System.out.println("Here is the Negative Element in Arrays are Replaced with Zero : " + Arrays.toString(posArr));
    }
    static void positiveArr(int[] arr, int[] posArr, int n)
    {
        if(n < 0) return ;
        positiveArr(arr,posArr,n - 1);
        if(arr[n] < 0)
            posArr[n] = 0;
        else
            posArr[n] = arr[n];
    }

    static int countPositive(int[] arr,int n)
    {
        if(n < 0) return 0;
        return countPositive(arr,n - 1) + (arr[n] > 0 ? 1 : 0);
    }

}
