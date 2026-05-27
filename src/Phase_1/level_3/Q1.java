//Take a 3-digit number and check if all digits are distinct.
package Phase_1.level_3;

import java.util.Arrays;
import java.util.Scanner;

public class Q1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the numbers : ");
        int num = input.nextInt();
        int[] arr = new int[3];

        int temp;
        for (int i = arr.length - 1 ; i >= 0 ; i--)
        {
            temp = num % 10;
            num = num / 10;
            arr[i] = temp;
        }
//        System.out.println(Arrays.toString(arr));

        if(checkDistant(arr))
        {
            System.out.println(Arrays.toString(arr) + " are distant numbers.");
        }
        else
        {
            System.out.println(Arrays.toString(arr) + " are not distant numbers");
        }
    }
    public static boolean checkDistant(int[] arr)
    {
        for (int i = 0; i < arr.length - 1; i++)
        {
            for (int j = i + 1 ; j < arr.length; j++)
            {
                if(arr[i] == arr[j])
                {
                    return false;
                }
            }
        }
        return true;
    }

}
