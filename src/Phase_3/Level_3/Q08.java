//Print numbers in increasing and decreasing order in same function.
package Phase_3.Level_3;

import java.util.Scanner;

public class Q08
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = input.nextInt();

        printBoth(1,n);
    }

    static void printBoth(int count,int n)
    {
        if(count == n)
        {
            System.out.print(count + " ");
            return;
        }
        System.out.print(count + " ");
        printBoth(count + 1,n);
        System.out.print(count + " ");
    }
}