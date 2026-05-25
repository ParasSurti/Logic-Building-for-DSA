//Check if a given year is a leap year.
package Level_1;

import java.util.Scanner;

public class Q5
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Year : ");
        int num = input.nextInt();

        if(num % 4 == 0)
        {
            System.out.println(num + " is a leap year.");
        }
        else
        {
            System.out.println(num + " is not a leap year.");
        }
    }
}
