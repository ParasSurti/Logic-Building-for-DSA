//Check if a number is even or odd.
package Phase_1.Level_1;

import java.util.Scanner;

public class Q2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = input.nextInt();

        if(num % 2 == 0)
        {
            System.out.println( num + " is a even number.");
        }
        else
        {
            System.out.println(num + " is a odd number.");
        }
    }
}
