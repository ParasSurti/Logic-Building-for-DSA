//Check if an amount can be evenly divided into 2000, 500, and 100 currency notes.
package Phase_1.level_3;

import java.util.Scanner;

public class Q7
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount : ");
        int amount = input.nextInt();

        if(amount % 100 != 0)
        {
            System.out.println("₹" + amount + " can't be evenly divided between ₹2000, ₹500, ₹100.");
            return;
        }

        int remaining = amount;

        int count_2000 = remaining / 2000;
        remaining %= 2000;

        int count_500 = remaining / 500;
        remaining %= 500;

        int count_100 = remaining / 100;


        System.out.println("₹" + amount + " is evenly divided by taking ₹2000, ₹500, ₹100 : ["
                + count_2000 + ", "+count_500 +", " + count_100 +"]");
    }
}
