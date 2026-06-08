//Print Stars in Even Numbers (2, 4, 6, 8, 10)
package Phase_2.Level_4;

import java.util.Scanner;

public class Q7
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= i * 2; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
