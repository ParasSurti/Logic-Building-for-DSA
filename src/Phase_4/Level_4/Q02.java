//Compare two arrays — check if they contain the same elements (ignore order).
package Phase_4.Level_4;

import java.lang.Integer;
import java.util.Scanner;

public class Q02
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the Arrays : ");
        int n = input.nextInt();

        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr1[i] = input.nextInt();
        }

        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr2[i] = input.nextInt();
        }

        if(cmp(arr1,arr2,n - 1,0))
        {
            System.out.println("Both Array contain the same element!!");
        }
        else
            System.out.println("Both Array doesn't contain same element!!");
    }
    static boolean cmp(int[] arr1, int[] arr2, int n, int index)
    {
        if(n < 0) return true;

        // Try to find and consume a match for arr1[index], arr2
        if (!findAndMark(arr2,arr1[index],arr1.length - 1))
        {
            return false;
        }
        return cmp(arr1,arr2, n - 1, index + 1);
    }
    static boolean findAndMark(int[] arr2,int target, int n)
    {
        if (n < 0) return false;
        if (arr2[n] == target)
        {
            arr2[n] = Integer.MIN_VALUE;
            return true;
        }
        return findAndMark(arr2,target,n - 1);
    }
}
