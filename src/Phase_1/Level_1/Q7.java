//Take three numbers and print the largest.
package Phase_1.Level_1;

import java.util.Scanner;

public class Q7
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the 3 Numbers : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        if(num1 > num2 && num1 > num3)
        {
            System.out.println( num1 + " is the largest from both " +num2 +"," + num3 + ".");
        }
        else if(num2 > num1 && num2 > num3)
        {
            System.out.println(num2 + " is the largest form both " + num1 + "," + num3 + ".");
        }
        else
        {
            System.out.println(num3 + " is the largest from both " + num1 + "," + num2  + ".");
        }
    }
}
