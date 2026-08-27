//Print frequency of each digit in a number.
package Phase_6.Level_5;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Q06
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = input.nextInt();

        int[] arr = new int[10];
        for (int i = 0; num != 0 ; i++)
        {
            int digit  = num % 10;
            arr[digit]++;
            num /= 10;
        }
        System.out.println(Arrays.toString(arr));
    }
}
