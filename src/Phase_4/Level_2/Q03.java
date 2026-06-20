//Find the first occurrence of a given number.
package Phase_4.Level_2;

import java.util.Scanner;

public class Q03
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of arrays : ");
        int n = input.nextInt();

        System.out.print("Enter the Number(k) : ");
        int k = input.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = input.nextInt();
        }
        int occur = occur(arr, k, n,0);
        System.out.println("At " + occur + " is the first occurrence of a given number.");
    }

    static int occur(int[] arr,int k , int end, int start)
    {
        if(start > end) return -1;
        if(arr[start] == k) return start;
        return occur(arr,k, end,start+1);
    }
}
