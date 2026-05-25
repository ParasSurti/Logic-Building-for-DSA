//Take a number and print whether it’s positive, negative, or zero.

package Level_1;

import java.util.Scanner;

public class Q1 {
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = input.nextInt();

        if(num > 0)
        {
            System.out.println( num + " is a positive number");
        }
        else if(num < 0 )
        {
            System.out.println(num + " is a negative number");
        }
        else
        {
            System.out.println(num + " is an zero");
        }
    }
}
