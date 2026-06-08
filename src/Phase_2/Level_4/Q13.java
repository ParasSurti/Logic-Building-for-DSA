// Print a Left Aligned Triangle with Sequence of Number.
package Phase_2.Level_4;

import java.util.Scanner;

public class Q13
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number (Level): ");
        int n = input.nextInt();

        int sum = 1;
        for (int i = 1; i <= n ; i++)
        {
            for (int j = 1; j <=i ; j++)
            {
                System.out.print(sum + " ");
                sum++;
            }
            System.out.println();
        }
    }
}
