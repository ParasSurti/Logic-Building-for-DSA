//Rotate an array by one position to the left.
package Phase_4.Level_3;

import java.util.Arrays;
import java.util.Scanner;

public class Q07
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
        left(arr,newArr, n - 1,0);
        System.out.println(Arrays.toString(newArr));
    }
    static int left(int[] arr, int[] newArr, int n, int index)
    {
        if (n < 0) return index;
        index = left(arr, newArr, n - 1,index);
        if(n == arr.length - 1)
        {
            newArr[index] = arr[0];
            return index;
        }
        newArr[index] = arr[n + 1];
        return index + 1;
    }
}
