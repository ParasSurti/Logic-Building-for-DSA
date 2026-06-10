//Find the smallest and largest digit in a given number.
package Phase_2.Level_5;

import java.util.Scanner;

public class Q05
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int digit = input.nextInt();
        int num = digit;
        int l = 0;
        int s = digit;
        while(digit != 0)
        {
            int temp = digit % 10;
            //Largest number
            if(temp > l)
            {
                l = temp;
            }
            if(temp < s)
            {
                s = temp;
            }
            digit /= 10;
        }

        System.out.println("The Largest Number in " + num + " is " + l);
        System.out.println("The Smallest Number in " + num + " is " + s);
    }
}
