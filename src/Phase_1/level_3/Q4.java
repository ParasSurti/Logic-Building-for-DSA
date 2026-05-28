//Check whether a given integer is single-digit, double-digit, or multi-digit.
package Phase_1.level_3;

import java.util.Scanner;

public class Q4
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Integer : ");
        int num = input.nextInt();

        //handle negative too
        num = Math.abs(num);

        //Special case : if num = 0
        if(num == 0)
        {
            System.out.println("Its a Single Digit Number");
            return;
        }

        int count = 0;
        while(num != 0)
        {
                num = num / 10;
                count++;
        }

        //condition
        if(count == 1)
        {
            System.out.println("Its a Single Digit number.");
        }
        else if(count == 2)
        {
            System.out.println("Its a Double Digit number.");
        }
        else
        {
            System.out.println("Its a Multi Digit number.");
        }
    }
}
