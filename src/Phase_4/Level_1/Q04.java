//Find the maximum element in an array.
package Phase_4.Level_1;

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
        System.out.println("The Largest Element inside the array : " + large(arr[0],arr,n - 1));
    }
    static int large(int largest, int[] arr, int n )
    {
        if(n < 0) return largest;
        largest = large(largest,arr,n - 1);
        if(largest < arr[n]) largest = arr[n];
        return largest;
    }
}
