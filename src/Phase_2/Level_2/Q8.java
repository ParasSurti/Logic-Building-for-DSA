//Check if a number is prime or not.
package Phase_2.Level_2;

import java.util.Scanner;

public class Q8
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = input.nextInt();

        boolean isPrime = true;
        for (int i = 2; i < num; i++)
        {
            for (int j = 2; j < i; j++)
            {
                if(i % j == 0)
                {
                    isPrime = false;
                    break;
                }
            }
        }
        if(isPrime)
        {
            System.out.println(num + " is a Prime number!!");
        }
        else
        {
            System.out.println(num + " is not a Prime number!!");
        }
        input.close();
    }
}
