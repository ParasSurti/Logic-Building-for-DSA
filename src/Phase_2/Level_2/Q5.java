//Check if a number is an Armstrong number.
package Phase_2.Level_2;

import java.util.Scanner;

public class Q5
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = input.nextInt();
        int values = num;
        String numbers = Integer.toString(num);

        int multiply = 1;
        int sum = 0;
        for (int i = 0; i < numbers.length(); i++)
        {
            int temp = num % 10;
            for (int j = 0; j < numbers.length(); j++)
            {
                multiply *= temp;
            }
            num /= 10;
            sum += multiply;
            multiply = 1;
        }
        if(sum == values)
        {
            System.out.println(values +" is a Armstrong Number.");
        }
        else
        {
            System.out.println(values + " is not a Armstrong Number.");
        }
    }
}
