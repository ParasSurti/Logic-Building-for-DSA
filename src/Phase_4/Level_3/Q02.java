//Create a new array containing only even elements.
package Phase_4.Level_3;

import java.util.Arrays;
import java.util.Scanner;

public class Q02
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

        int count = evenCount(arr, n - 1);
        int[] evenArr = new int[count];

        fillEven(arr, evenArr, n - 1, 0);

        System.out.println(Arrays.toString(evenArr));


    }
    static int fillEven(int[] arr, int[] even,int n, int index)
    {
        if( n < 0 ) return index;
        index = fillEven(arr,even,n - 1,index);
        if(arr[n] % 2 == 0)
        {
            even[index++]  = arr[n];
        }
        return index;
    }

    static int evenCount(int[] arr,int n)
    {
        if(n < 0) return 0;
        return evenCount(arr,n - 1) + (arr[n] % 2 == 0 ? 1 : 0);
    }
}