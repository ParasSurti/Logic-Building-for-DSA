// Count how many elements are perfect squares.
package Phase_4.Level_2;

import java.util.Scanner;

public class Q10
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = input.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = input.nextInt();
        }

        int count = 0;
        int pfsq = sq(arr, count, n - 1);
        System.out.println("There are only " + pfsq + " elements which are perfect squares.");
    }
    static int sq(int[] arr,int count, int n )
    {
        if(n < 0) return count;
        count = sq(arr,count,n - 1);
        if(square(arr[n] ,n)) count++;
        return count;
    }
    static boolean square(int num ,int n)
    {
        if(num < 0) return false;
        int root = (int) Math.sqrt(num);
        return root * root == num;
    }
}
