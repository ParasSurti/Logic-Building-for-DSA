//Print the factorial of a given number.
package Phase_2.Level_1;

import java.util.Scanner;

public class Q9
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = input.nextInt();

        int fact = 1;
        for (int i = num; i > 0; i--)
        {
            fact = fact * i;
        }
        System.out.println("The factorial of " + num + " is "+ fact );
    }
}
