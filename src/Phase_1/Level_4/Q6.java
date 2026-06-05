//Take two numbers and check if both are positive and their sum is less than 100.
package Phase_1.Level_4;

import java.util.Scanner;

public class Q6
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        int num1 = input.nextInt();

        System.out.print("Enter the Second Number : ");
        int num2 = input.nextInt();

        boolean num_positive = num1 > 0 && num2 > 0;
        boolean num_sum = num1 + num2 < 100;

        if(num_positive && num_sum)
        {
            System.out.println("The Given two number [" + num1 + ", " + num2 +"] are both positive & their sum is less than 100." );
        }
        else
        {
            if(!num_positive && !num_sum)
            {
                System.out.println("The Given two number [" + num1 + ", " + num2 + "] are not being positive & their sum isn't less than 100");
            }
            else if(!num_positive)
            {
                System.out.println("The Given two number [" + num1 + ", " + num2 + "] are have sum less than 100, But are not Positive!!");
            }
            else
            {
                System.out.println("The Given two number [" + num1 + ", " + num2 + "] are Positive, But Doesn't have sum less than 100!!");
            }
        }
    }
}
