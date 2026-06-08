//Print a Right-Aligned Triangle of Stars
package Phase_2.Level_4;

import java.util.Scanner;

public class Q6
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++)
        {
            for (int j = 0; j < n - i; j++)
            {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}