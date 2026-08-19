//Merge two arrays into one.
package Phase_6.Level_3;

import java.util.Arrays;
import java.util.Scanner;

public class Q07
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the 1st array size : ");
        int arr1_n = input.nextInt();

        System.out.print("Enter the 2nd array size : ");
        int arr2_n = input.nextInt();

        int[] arr1 = new int[arr1_n];
        int[] arr2 = new int[arr2_n];

        //for arr 1
        for (int i = 0; i < arr1_n; i++)
        {
            arr1[i] = input.nextInt();
        }
        System.out.println();
        //for arr 2
        for (int i = 0; i < arr2_n; i++)
        {
            arr2[i] = input.nextInt();
        }

        int[] newArr = new int[arr1_n + arr2_n];
        for (int i = 0; i < arr1_n; i++)
        {
                newArr[i] = arr1[i];
        }
        for (int i = 0; i < arr2_n; i++)
        {
            newArr[arr1_n + i] = arr2[i];
        }
        System.out.println(Arrays.toString(newArr));
    }
}
