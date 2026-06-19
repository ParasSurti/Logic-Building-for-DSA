//Count how many times a given element appears.
package Phase_4.Level_2;

import java.util.Scanner;

public class Q02
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of Arrays : ");
        int n = input.nextInt();

        System.out.print("Enter the number (k) : ");
        int k = input.nextInt();


        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = input.nextInt();
        }
        int ans = count(0,arr,n - 1,k);
        System.out.println(k + " has appear " + ans + " times in the arrays.");
    }
    static int count(int count,int[] arr, int n, int k)
    {
        if(n < 0) return 0;
        count = count(count,arr,n - 1, k);
        if(arr[n] == k) return count + 1;
        return count;
    }
}
