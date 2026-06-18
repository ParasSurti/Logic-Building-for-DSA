//Input n and take n integers into an array; print them.
package Phase_4.Level_1;

import java.util.Arrays;
import java.util.Scanner;

public class Q01
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = input.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = input.nextInt();;
        }
        printArr(arr,n - 1);

        //Used To.String method..
//        System.out.println(Arrays.toString(printArr(arr,n-1)));
    }

    //Normal recursion method
    public static void printArr(int[] arr, int n) {
        if (n < 0) return;
        printArr(arr, n - 1);
        System.out.print(arr[n] + " ");
    }


//    Used toString method
//    public static int[] printArr(int[] arr, int n)
//    {
//        if(n < 0) return arr;
//        printArr(arr , n - 1);
//        System.out.println(arr[n]);
//        return arr;
//    }

}
