//Take time (hours and minutes) and print the smaller angle between the hour and minute hands.
package Phase_1.Level_5;

import java.util.Scanner;

public class Q4
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int hour = 0, minute = 0;
        boolean valid = false;

        while(!valid)
        {
            System.out.print("Enter the time : ");
            String time = input.nextLine().trim();

            if(!time.matches("\\d{1,2}:\\d{2}"))
            {
                System.out.println("Enter the time in HH : MM Format!!");
                continue;
            }
            String[] parts = time.split(":");
            hour = Integer.parseInt(parts[0]);
            minute = Integer.parseInt(parts[1]);

            //validators range
            if(hour < 0 || hour > 24)
            {
                System.out.println("Invalid Time ! Enter Hours Between 0 to 23.");
            }
            else if (minute < 0 || minute > 59)
            {
                System.out.println("Invalid Time ! Enter Minutes Between 0 to 59.");
            }
            else
            {
                valid = true;
            }

            double hourAngle =  (hour % 12) * 30  + minute * 0.5;
            double minuteAngle = minute * 6;

            double angle = Math.abs(hourAngle - minuteAngle);

            if(angle > 360)
            {
                angle = 360 - angle;
            }
            System.out.println("Smaller angle between hands = " + Math.round(angle) + "°");
            input.close();
        }
    }
}
