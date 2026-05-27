//Check if one of two given numbers is a multiple of the other.
package Phase_1.Level_2;

import java.util.Scanner;

public class Q4
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the two numbers : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        if( num1 % num2 == 0.0)
        {
            System.out.println(num1 +" is the multiply of " + num2);
        }
        else if(num2 % num1 == 0.0)
        {
            System.out.println( num2 + " is the multiply of " + num1);
        }
        else
        {
            System.out.println(num1 + ", " + num2 + " both aren't each other's multiply.");
        }
    }
}
