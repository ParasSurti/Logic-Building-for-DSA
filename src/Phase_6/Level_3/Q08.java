//Find the second-largest element in an array.
package Phase_6.Level_3;

import java.util.Scanner;

public class Q08
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int n = input.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = input.nextInt();
        }

        int largest = arr[0];
        for (int i = 0; i < n; i++)
        {
            if(largest <= arr[i])
            {
                largest = arr[i];
            }
        }

        boolean found = false;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++)
        {
            if(arr[i] != largest)
            {
                if(!found || arr[i] > secondLargest)
                {
                    secondLargest = arr[i];
                    found = true;
                }
            }
        }


        System.out.println("Largest " + largest);
        System.out.println("Second Largest " + secondLargest);
    }
}
