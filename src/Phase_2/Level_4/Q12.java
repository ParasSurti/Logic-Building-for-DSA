//Print Repeated Numbers per Row (Same Number Repeated)
package Phase_2.Level_4;

import java.util.Scanner;

public class Q12
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= i ; j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
