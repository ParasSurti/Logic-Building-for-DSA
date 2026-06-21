//Swap the first and last elements of the array.
package Phase_4.Level_3;

import java.util.Arrays;
import java.util.Scanner;

public class Q05
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int n = input.nextInt();

        int length = n - 1;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = input.nextInt();
        }

        int[] newArr = new int[n];
        swap(arr,newArr,n - 1,length);
        System.out.println(Arrays.toString(newArr));
    }
    static void swap(int[] arr,int[]newArr,int n,int length)
    {
        if(n < 0)
        {
            first_Last(newArr,length);
            return ;
        }
        newArr[n] = arr[n];
        swap(arr,newArr,n - 1,length);

    }
    static void first_Last(int[] newArr,int length)
    {
        int temp = newArr[0];
        newArr[0] = newArr[length];
        newArr[length] = temp;
    }
}
