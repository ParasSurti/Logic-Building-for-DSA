//Count how many numbers are divisible by 3 and 5 both.
package Phase_4.Level_2;

import java.util.Scanner;

public class Q09
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

        int count = 0;
        int total = countNum(arr,count,n - 1);
        System.out.println("There are total " + total + " elements in the array, which are divisible by 3 & 5." );
    }
    static int countNum(int[] arr, int count, int n)
    {
        if(n < 0) return count;
        count = countNum(arr,count,n - 1);
        if(checkNumber(arr[n]))
            count++;
        return count;
    }
    static boolean checkNumber(int num)
    {
        return num % 3 == 0 && num % 5 == 0;
    }

}
