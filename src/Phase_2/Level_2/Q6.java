//Check if a number is a perfect number.
package Phase_2.Level_2;

import java.util.Scanner;

public class Q6
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = input.nextInt();

        int divisor = 1;
        int sum = 0;
        for (int i = 1; i < num; i++)
        {
            if(num % i == 0)
            {
                sum += i;
            }
        }
        if(sum == num)
        {
            System.out.println(num + " is a perfect number!!");
        }
        else
        {
            System.out.println(num + " is not a perfect number!!");
        }
    }
}
