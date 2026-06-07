//Print Square of Stars (n x n Stars)
package Phase_2.Level_4;

import java.util.Scanner;

public class Q4
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number (n) : ");
        int n = input.nextInt();

        for (int i = 0; i < n; i++)
        {
            for (int j = 0 ; j < n ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
