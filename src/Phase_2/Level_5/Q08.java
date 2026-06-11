//Print factorial of each number from 1 to n.
package Phase_2.Level_5;

import java.util.Scanner;

public class Q08
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the nth number : ");
        int n = input.nextInt();


        for (int i = 1; i <= n ; i++)
        {
            int fact = 1;
            //factorial
            for (int j= i; j >= 1 ; j--)
            {
                fact *= j;
            }
            System.out.println( "Factorial of " + i + " is " + "'" + fact + "'");
        }
    }
}
