//Print Numbers in an Increasing Sequence (1, 12, 123, 1234, 12345)
package Phase_2.Level_4;

import java.util.Scanner;

public class Q11
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number (Level) : ");
        int n = input.nextInt();

        for (int i = 1; i <= n ; i++)
        {
            for (int j = 1; j <= i ; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
