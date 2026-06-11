//Print a pattern where each row i prints i*i.
package Phase_2.Level_5;

import java.util.Scanner;

public class Q07
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = input.nextInt();

        for (int i = 1; i <= n ; i++)
        {
            int row = i * i;
            System.out.println(i + " x " + i + " = " + row);
        }
    }
}
