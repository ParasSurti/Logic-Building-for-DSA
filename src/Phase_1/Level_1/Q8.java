//Take a temperature value and print “Cold”, “Warm”, or “Hot” using range conditions.
package Phase_1.Level_1;

import java.util.Scanner;

public class Q8
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Temperature ");
        float temp = input.nextFloat();

        if(temp > 30 && temp < 40)
        {
            System.out.println(temp + "°C is hot");
        }
        else if(temp > 20 && temp < 30)
        {
            System.out.println(temp + "°C is warm");
        }
        else if (temp > 0 && temp <10)
        {
            System.out.println(temp + "°C is cold");
        }
    }
}
