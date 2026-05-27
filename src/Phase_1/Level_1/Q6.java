//Take two numbers and print the larger one.
package Phase_1.Level_1;

import java.util.Scanner;

public class Q6
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Two Numbers : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        if(num1 > num2)
        {
            System.out.println(num1 + " is the largest number.");
        }
        else
        {
            System.out.println(num2 + " is the largest number.");
        }
    }
}
