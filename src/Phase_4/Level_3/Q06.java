//Reverse an array (without using built-in reverse).
package Phase_4.Level_3;

import java.util.Arrays;
import java.util.Scanner;

public class Q06
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = input.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = input.nextInt();
        }

        int[] newArr = new int[n];
        reverse(arr,newArr,n - 1,0);
        System.out.println("Reverse order : " + Arrays.toString(newArr));
    }
    static void reverse(int[] arr,int[] newArr, int n, int i)
    {
        if(n < 0) return;
        newArr[i] = arr[n];
        reverse(arr,newArr,n - 1,i + 1);
    }
}
