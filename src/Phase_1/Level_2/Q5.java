//Take the hour of the day (0–23) and print “Good Morning”, “Good Afternoon”, “GoodEvening”, or “Good Night”.
package Phase_1.Level_2;

import java.util.Scanner;

public class Q5
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the time of the day : ");
        float hr = input.nextFloat();

        if(Math.round(hr) >= 0 && Math.round(hr) <= 11.59)
        {
            System.out.println("Current time is " + hr + "\n !GOOD MORNING! " );
        }
        else if(Math.round(hr) >=12 && Math.round(hr) <= 17.59)
        {
            System.out.println("Current time is " + hr + "\n !GOOD AFTERNOON! ");
        }
        else if(Math.round(hr) >=18 && Math.round(hr) <= 21.59)
        {
            System.out.println("Current time is " + hr + "\n !GOOD AFTERNOON! ");
        }
        else
        {
            System.out.println("Current time is " + hr + "\n !GOOD NIGHT! ");
        }
    }
}
