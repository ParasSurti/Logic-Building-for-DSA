//Take a 4-digit number and check if the first and last digits are equal.
package Phase_1.level_3;

import java.util.Arrays;
import java.util.Scanner;

public class Q3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 4-Digit number : ");
        int num = input.nextInt();

        int[] arr = new int[4];
        int temp;

        for (int i = arr.length - 1; i >= 0 ; i--)
        {
            temp = num % 10;
            num = num / 10;
            arr[i] = temp;
        }
        int last_digit = arr.length - 1;
        int first_digit = 0;

        if(digits_Equal(arr,last_digit,first_digit))
        {
            System.out.println(arr[first_digit] + " and " + arr[last_digit] + " are equal, From this 4-Digit number " + Arrays.toString(arr));
        }
        else
        {
            System.out.println(arr[first_digit] + " and " + arr[last_digit] + " are not equal, From this 4-Digit number " + Arrays.toString(arr));
        }
    }

    public static boolean digits_Equal(int[] arr, int first , int last)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[first] == arr[last])
            {
                return true;
            }
        }
        return false;
    }
}
