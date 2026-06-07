//Print n Stars on Same Line
package Phase_2.Level_4;

import java.util.Scanner;

public class Q3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number (n) : ");
        int n = input.nextInt();

        for (int i = 0; i < n; i++)
        {
            System.out.print("*");
        }
    }
}
