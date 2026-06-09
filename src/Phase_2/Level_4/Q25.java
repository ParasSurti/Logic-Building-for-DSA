//Print a Centered Number Pyramid (5 4 3 2 1 2 3 4 5)
package Phase_2.Level_4;

import java.util.Scanner;

public class Q25
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = input.nextInt();

        for (int i = 1; i <= n ; i++)
        {
            //spaces
            for (int j = i; j <= n - 1; j++)
            {
                System.out.print(" ");
            }
            //left up
            for (int j = n ; j >= (n - i) + 1; j--)
            {
                System.out.print(j);
            }

            //right up
            for (int j = n - i + 2 ; j <= n; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
