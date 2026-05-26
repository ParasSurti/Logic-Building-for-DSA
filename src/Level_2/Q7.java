//Take two numbers and determine whether both are even, both are odd, or one is even and one is odd.
package Level_2;

import java.util.Scanner;

public class Q7
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        boolean isNum1Even = (num1 % 2 == 0);
        boolean isNum2Even = (num2 % 2 == 0);

        if(isNum1Even && isNum2Even)
        {
            System.out.println(num1 + " and " + num2 + " are even.");
        }
        else if( !isNum1Even && !isNum2Even)
        {
            System.out.println(num1 + " and " + num2 + " are odd.");
        }
        else
        {
            if(isNum1Even)
            {
                System.out.println(num1 + " is even, " + num2 + " is odd.");
            }
            else
            {
                System.out.println(num1 + " is odd, " + num2 + " is even.");
            }
        }
    }
}
