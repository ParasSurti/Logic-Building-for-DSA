//Print a Centered Pyramid with sequential number from 1
package Phase_2.Level_4;

import java.util.Scanner;

public class Q21
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = input.nextInt();

        int number = 1;
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n - i ; j++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++)
            {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}
