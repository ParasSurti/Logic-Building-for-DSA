//Find the index of the maximum element.
package Phase_4.Level_1;

import java.util.Scanner;

public class Q08
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the number : ");
        int n = input.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = input.nextInt();
        }

        int maxId = maxIndex(arr, n - 1);
        System.out.println("Index of max element : " + maxId);
        System.out.println("The Max Element : " + arr[maxId]);
    }
    static int maxIndex(int[] arr, int n)
    {
        if(n == 0) return 0;
        int prevMax = maxIndex(arr,n - 1);
        if(arr[n] > arr[prevMax])
            return n;
        else
            return prevMax;
    }
}