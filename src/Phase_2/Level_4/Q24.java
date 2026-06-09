//Print a Centered Pyramid Diamond of stars
package Phase_2.Level_4;

import java.util.Scanner;

public class Q24
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = input.nextInt();

        //first half
        for (int i = 1; i <= n; i++)
        {
            //For spaces
            for (int j = 1; j <= n - i; j++)
            {
                System.out.print(" ");
            }
            //For Stars
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        //Second half
        for (int i = n - 1; i >= 1; i--)
        {
            //For spaces
            for (int j = n - i; j >= 1; j--)
            {
                System.out.print(" ");
            }
            //For Stars
            for (int j = i ; j >= 1; j--)
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
