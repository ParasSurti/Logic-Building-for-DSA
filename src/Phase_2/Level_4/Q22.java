//Print a Left-Aligned Diamond pattern of stars
package Phase_2.Level_4;

import java.util.Scanner;

public class Q22
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = input.nextInt();

        int num = 1;
        for (int i = 1; i <= n ; i++)
        {
            //First half...
            for (int j = 1; j <= i ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n ; i > 1 ; i--)
        {
            //First half...
            for (int j = i ; j > 1 ; j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
