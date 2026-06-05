//Take a weekday number (1–7) and determine if it is a weekday or weekend.
package Phase_1.Level_4;

import java.util.Scanner;

public class Q8
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Week Number : ");
        int num = input.nextInt();

        switch (num)
        {
            case 6,7 :
                System.out.println("It's a Weekend.");
                break;
            case 1,2,3,4,5 :
                System.out.println("It's a Weekday.");
                break;
            default :
                System.out.println("Invalid! Please enter a number between 1-7.");
        }
    }
}
