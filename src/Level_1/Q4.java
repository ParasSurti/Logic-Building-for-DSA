//Check if a number is divisible by both 3 and 5.
package Level_1;

import java.util.Scanner;

public class Q4
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = input.nextInt();

        if(num % 3 == 0  && num % 5 == 0)
        {
            System.out.println(num + " is divisible by both 3 & 5.");
        }
        else
        {
            System.out.println(num + " is not divisible by 3 & 5.");
        }
    }
}
