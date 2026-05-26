//Take a month number (1–12) and print the number of days in that month (ignore leap years).
package Level_2;

import java.util.Scanner;

public class Q10
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Month Number(1-12) : ");
        int nums = input.nextInt();

        switch (nums)
        {
            case 2 :
                System.out.println(nums + " has 28 days.");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(nums + " has 30 days.");
                break;

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(nums + " has 31 days.");
                break;

            default :
                System.out.println("Invalid month! Enter valid number between 1 - 12.");
        }
    }
}
