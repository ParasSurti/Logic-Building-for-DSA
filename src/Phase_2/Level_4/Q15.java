//Print a Left-Aligned Triangle with numbers 1-0
package Phase_2.Level_4;

import java.util.Scanner;

public class Q15
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number (Level) : ");
        int n = input.nextInt();

        int num = 0;
        for (int i = 1; i <= n; i++)
        {
            int current = num;
            for (int j = 1; j <= i ; j++)
            {
                System.out.print(current + " ");
                current = 1 - current;

            }
            num = 1 - num;
            System.out.println();
        }
    }
}
