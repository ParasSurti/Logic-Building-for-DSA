//Reverse an array in-place.
package Phase_6.Level_3;

import java.util.Arrays;
import java.util.Scanner;

public class Q04
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of Arrays : ");
        int n = input.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = input.nextInt();
        }


        int store = 0;
        int j = n - 1;
        //Reverse
        for (int i = 0; i < n; i++)
        {
            if(j > i )
            {
                store = arr[i];
                arr[i] = arr[j];
                arr[j] = store;
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
