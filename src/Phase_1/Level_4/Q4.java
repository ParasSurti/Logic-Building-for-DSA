//Take 24-hour time (hours and minutes) and print whether it is AM or PM.
package Phase_1.Level_4;

import java.util.Scanner;

public class Q4
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int minutes = 0 , hours = 0;
        boolean validInput = false;

        while(!validInput)
        {
            System.out.print("Enter time (HH:MM) : ");
            String timeStr = input.nextLine().trim();

            if(!timeStr.matches("\\d{1,2}:\\d{2}"))
            {
                System.out.println("Invalid format! Please use HH:MM (eg. 14:30).");
                continue;
            }
            String[] parts = timeStr.split(":");
            hours   = Integer.parseInt(parts[0]);
            minutes = Integer.parseInt(parts[1]);


            //Validate ranges
            if(hours < 0 || hours > 23)
            {
                System.out.println("Invalid Time ! Enter Hours Between 0 to 23.");
            }
            else if(minutes < 0 || minutes > 59)
            {
                System.out.println("Invalid Time ! Enter Minutes between 0 to 59.");
            }
            else
            {
                validInput = true;
            }
        }

        //Determine AM or PM
        if(hours < 12)
        {
            System.out.printf("%02d:%02d AM %n" , hours , minutes);
        }
        else
        {
            System.out.printf("%02d:%02d PM %n" , hours, minutes);
        }
        input.close();
    }
}