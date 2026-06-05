//Take a 3-digit number and check if the sum of the first and last digit equals the middle digit.
package Phase_1.Level_5;

import java.util.Scanner;

public class Q7
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the 3 digit number : ");
        int a = input.nextInt();

        if(a < 100 || a > 999)
        {
            System.out.println("!! Enter number which have 3 digit !!");
            return;
        }

        int first = a / 100;
        int middle = (a / 10) % 10;
        int last = a % 10;

        boolean isSame = first + last == middle;

        if(isSame)
        {
            System.out.println(a + " satisfies the condition (sum of the first and last digit equals the middle digit.)");
        }
        else
        {
            System.out.println(a + " doesn't satisfies the condition (sum of the first and last digit equals the middle digit.)");
        }
    }
}
