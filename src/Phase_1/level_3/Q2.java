//Take a 3-digit number and determine if the middle digit is the largest, smallest, or neither.
package Phase_1.level_3;

import java.util.Arrays;
import java.util.Scanner;

public class Q2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a 3-Digit numbers :- ");
        int num = input.nextInt();

        int temp = 0;
        int arr[] = new int[3];

        for (int i = arr.length - 1 ;i >= 0; i--)
        {
            temp = num % 10;
            num = num / 10;
            arr[i] = temp;
        }
        int mid = arr.length / 2;

        if(Islargest(arr,mid))
        {
            System.out.println( arr[mid] + " is the Largest Digit from " + Arrays.toString(arr));
        }
        else if (Issmallest(arr,mid))
        {
            System.out.println( arr[mid] + " is the Smallest Digit from " + Arrays.toString(arr));
        }
        else
        {
            System.out.println( arr[mid] + " is neither smallest or largest Digit from " + Arrays.toString(arr));
        }

    }

    public static boolean Issmallest (int[] arr, int mid)
    {
        int small ;
        for (int i = 0; i < arr.length ; i++)
        {
            if(i != mid && arr[mid] > arr[i])
            {
                return false;
            }
        }
        return true;
    }

    public static boolean Islargest (int[] arr , int mid)
    {
        int large;
        for (int i = 0; i < arr.length; i++)
        {
            if (i != mid && arr[mid] < arr[i])
            {
                 return false;
            }
        }
        return true;
    }



}
