//Take two dates (day and month) and determine which one comes first in the calendar.
package Phase_1.Level_5;

import java.util.Scanner;

public class Q9
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First Date (day & month) : ");
        String date1 = input.nextLine().trim();
        System.out.print("Enter the Second Date (day & month) :");
        String date2 = input.nextLine().trim();

        boolean date1_format = date1.matches("\\d{1,2}-\\d{1,2}");
        boolean date2_format = date2.matches("\\d{1,2}-\\d{1,2}");

        if(!date1_format || !date2_format)
        {
            System.out.println("Enter both dates in DD-MM format!");
            return;
        }

        //Validators range for date1
        String[] date1_parts = date1.split("-");
        int day1 = Integer.parseInt(date1_parts[0]);
        int mon1 = Integer.parseInt(date1_parts[1]);

        //Validators range for date2
        String[] date2_parts = date2.split("-");
        int day2 = Integer.parseInt(date2_parts[0]);
        int mon2 = Integer.parseInt(date2_parts[1]);

        //checking if the date are valid or not
       if(!isValidDate(day1,mon1))
       {
           System.out.println("First date is invalid!");
           return;
       }

       if(!isValidDate(day2,mon2))
       {
           System.out.println("Second date is invalid!");
           return;
       }

       // Compare dates
        if(mon1 < mon2)
        {
            System.out.println(date1 + " comes first in calendar!!");
        }
        else if(mon1 > mon2)
        {
            System.out.println(date2 + " comes first in calendar!!");
        }
        else
        {
            //same month, compare days
            if(day1 < day2)
            {
                System.out.println(date1 + " comes first in the calendar!!");
            }
            else if(day1 > day2)
            {
                System.out.println(date2 + " comes first in the calendar!!");
            }
            else
            {
                System.out.println("Both dates are the same.");
            }
        }
        input.close();
    }

    public static boolean isValidDate(int day ,int month)
    {
        if(month < 1 || month > 12 || day < 1)
        {
            return false;
        }
        switch (month)
        {
            case 1, 3, 5, 7, 8, 10, 12:
                return day <= 31;

            case 4, 6, 9, 11:
                return day <= 30;

            case 2:
                return day <= 28; // Ignoring leap years

            default:
                return false;
        }
    }
}
