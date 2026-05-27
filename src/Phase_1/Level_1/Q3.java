//Check if a number is divisible by 5
package Phase_1.Level_1;

import java.util.Scanner;

public class Q3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = input.nextInt();

        if(num % 5 == 0)
        {
            System.out.println(num + " is divisible by 5.");
        }
        else
        {
            System.out.println(num + " is not divisible by 5.");
        }
    }
}
