//Take a number and print “Fizz” if divisible by 3, “Buzz” if divisible by 5, and “FizzBuzz” if divisible by both.
package Phase_1.Level_4;

import java.util.Scanner;

public class Q2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = input.nextInt();


        boolean isdiv3 = num % 3 == 0;
        boolean isdiv5 = num % 5 == 0;
        boolean isbothdiv = isdiv3 && isdiv5;

        if(isbothdiv)
        {
            System.out.println("FizzBuzz");
        }
        else if (isdiv5)
        {
            System.out.println("Buzz");
        }
        else if(isdiv3)
        {
            System.out.println("Fizz");
        }
        else
        {
            System.out.println(num + " is not divisible by neither 3 or 5.");
        }
    }
}
