//Compare two arrays — check if they are equal (same elements & order).
package Phase_4.Level_4;

import java.util.Arrays;
import java.util.Scanner;

public class Q01
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of both Arrays : ");
        int n = input.nextInt();

        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr1[i] = input.nextInt();
        }
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr2[i] = input.nextInt();
        }

        System.out.println("First Array  : " + Arrays.toString(arr1));
        System.out.println("Second Array : " + Arrays.toString(arr2));


        if(cmp(arr1,arr2,n - 1))
        {
            System.out.println("Both Arrays are Equal!!");
        }
        else System.out.println("Both Array are not Equal!!");

    }
    static boolean cmp(int[] arr1, int[] arr2,int n)
    {
        if(n < 0) return true;

        if(arr1[n] != arr2[n])
        {
            return false;
        }
     return cmp(arr1, arr2,n - 1);

    }

}
