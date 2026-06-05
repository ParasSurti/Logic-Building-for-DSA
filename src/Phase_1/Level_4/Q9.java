//Take electricity units consumed and calculate the bill as per slabs (using if-else).
package Phase_1.Level_4;

import java.util.Scanner;

public class Q9
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        //here is the user's input...
        System.out.print("Enter your electricity units consumed : ");
        int units = input.nextInt();

        //bill calculation...
        float bill = 0f;
        if(units <= 100)
        {
            bill = units * 1.50f;
        }
        else if(units <= 200)
        {
            bill = (100 * 1.50f) + ((units - 100) * 2.50f);
        }
        else if(units <= 300)
        {
            bill = (100 * 1.50f) + (100 * 2.00f) + ((units - 200) * 4.00f);
        }
        else
        {
            bill = (100 * 1.50f) + (100 + 2.50f) + (100 * 4.00f) + ((units - 300) * 5.00f);
        }
        String billStr = (bill == Math.floor(bill))
                ? String.valueOf((long) bill)
                : String.valueOf(bill);
        System.out.println("Units consumed : " + units);
        System.out.println("Total Bill     : ₹" + billStr);
    }
}
