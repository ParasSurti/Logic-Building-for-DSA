//Print Stars in Odd Numbers
package Phase_2.Level_4;

import java.util.Scanner;

public class Q8
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++)
        {
            for (int j = 0; j < (2 * i) - 1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
