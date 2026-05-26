//Take a day number (1–7) and print the corresponding day name.
package Level_2;

import java.util.Scanner;

public class Q9
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the day number : ");
        int day = input.nextInt();

        if(day == 1)
        {
            System.out.println("its Monday.");
        }
        else if(day == 2)
        {
            System.out.println("its Tuesday.");
        }
        else if(day == 3)
        {
            System.out.println("its Wednesday.");
        }
        else if(day == 4)
        {
            System.out.println("its Thursday.");
        }
        else if(day == 5)
        {
            System.out.println("its Friday.");
        }
        else if(day == 6)
        {
            System.out.println("its Saturday.");
        }
        else if(day == 7)
        {
            System.out.println("its Sunday.");
        }
        else
        {
            System.out.println("Invalid day number.");
        }
    }
}
