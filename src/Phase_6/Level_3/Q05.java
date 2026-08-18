//Shift all zeros to the end of the array.
package Phase_6.Level_3;

import java.util.Arrays;
import java.util.Scanner;

public class Q5
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the Arrays : ");
        int n = input.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = input.nextInt();
        }

        int pos = 0;
        for (int i = 0; i < n; i++)
        {
            if(arr[i] != 0)
            {
                arr[pos] = arr[i];
                pos++;
            }
        }

        while(pos < n)
        {
            arr[pos] = 0;
            pos++;
        }

        System.out.println(Arrays.toString(arr));
    }
}
