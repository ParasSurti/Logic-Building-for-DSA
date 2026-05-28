//Check if a number is a multiple of 7 or ends with 7.
package Phase_1.level_3;

import java.util.Scanner;

public class Q5
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num = input.nextInt();

        boolean isMultiply7 = (num % 7 == 0);
        boolean EndWith7 = ( num % 10 == 7);

        if(isMultiply7 && EndWith7)
        {
            System.out.println(num + " is multiply of 7 && Ends with 7.");

        } else if (isMultiply7)
        {
            System.out.println(num + " is multiply of 7.");
        }
        else if(EndWith7)
        {
            System.out.println(num + " ends with 7.");
        }
        else
        {
            System.out.println(num + " isn't the multiply of 7 & Doesn't Ends with 7.");
        }
    }
}
