//Take coordinates (x, y) and determine which quadrant the point lies in.
package Phase_1.level_3;

import java.util.Scanner;

public class Q6
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x & y co-ordinates : ");
        int x = input.nextInt();
        int y = input.nextInt();

        boolean isXPositive = x > 0;
        boolean isYPositive = y > 0;

        //special Case
        if(x == 0 && y == 0)
        {
            System.out.println(x + ", " + y + " Lies at Origin");
            return;
        }
        else if(x == 0)
        {
            System.out.println(x + ", " + y + " Lies at Y axis.");
            return;
        }
        else if(y == 0)
        {
            System.out.println(x + ", " + y + " Lies at X axis.");
            return;
        }


        if(isXPositive)
        {
            if(isYPositive)
            {
                System.out.println(x + "," + y + " lies in Quadrant I.");
            }
            else
            {
                System.out.println(x + "," + y + " lies in Quadrant IV.");
            }
        }
        else
        {
            if(isYPositive)
            {
                System.out.println(x + "," + y + " lies in Quadrant II.");
            }
            else
            {
                System.out.println(x + "," + y + " lies in Quadrant III.");
            }
        }

    }
}
