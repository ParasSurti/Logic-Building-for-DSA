//Print only odd numbers from 1 to n recursively.
package Phase_3.Level_1;

import java.util.Scanner;

public class Q04
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the nth number : ");
        int n = input.nextInt();

        int start = 1;
        printOdd(start,n);
    }
    static void printOdd(int start , int n)
    {
        boolean isOdd = start % 2 != 0;
        if(isOdd)
        {
            System.out.print(start + " ");
        }
        if(start == n)
        {
            return;
        }
        printOdd(start + 1 , n);
    }
}
