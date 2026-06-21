//Rotate an array by one position to the right.
package Phase_4.Level_3;

import java.util.Arrays;
import java.util.Scanner;

public class Q08
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the Array : ");
        int n = input.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = input.nextInt();
        }

        int[] newArr = new int[n];
        right(arr,newArr,n - 1,1);
        System.out.println(Arrays.toString(newArr));
    }
    static int right(int[] arr, int[] newArr , int n, int index)
    {
        if(n < 0) return index;
        index = right(arr,newArr,n - 1, index);
        if(n == arr.length - 1)
        {
            newArr[0] = arr[n];
            return index;
        }
        newArr[index] = arr[n];
        return index += 1;
    }
}
