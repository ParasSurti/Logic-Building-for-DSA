//Take day and month and check if it forms a valid calendar date (ignoring leap years).
package Phase_1.Level_5;

import java.util.Scanner;

public class Q3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Month : ");
        int mon = input.nextInt();
        System.out.print("Enter the Day : ");
        int day = input.nextInt();

        boolean valid = false;

        switch (mon)
        {
            case 1,3,5,7,8,10,12 :
                valid = day > 0 && day <= 31;
                break;
            case 4,6,9,11 :
                valid = day > 0 && day <= 30;
                break;
            case 2 :
                valid = day > 0 && day <= 28;
                break;
            default:
                System.out.println("!!Invalid Month (1-12) !!");
        }

        if(valid)
        {
            System.out.println("This is a valid date.");
        }
        else
        {
            System.out.println("This is a invalid date.");
        }
    }
}
