//Find the maximum and minimum element in an array.
package Phase_6.Level_3;

import java.util.Scanner;

public class Q01
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of arrays : ");
        int size = input.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++)
        {
                arr[i] = input.nextInt();
        }

        int largest = arr[0];
        int smallest = arr[0];

        //For Largest Element
        for (int i = 0; i < size; i++)
        {
            if(largest < arr[i])
            {
                largest = arr[i];
            }
        }

        //For Smallest Element
        for (int i = 0; i < size; i++)
        {
            if( smallest > arr[i])
            {
                smallest = arr[i];
            }
        }
        System.out.println("Largest Element in Array : " + largest);
        System.out.println("Smallest Element in Array : " + smallest);
    }
}
