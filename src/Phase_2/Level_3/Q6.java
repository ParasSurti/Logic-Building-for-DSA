//Find the sum of all factors of a number.
package Phase_2.Level_3;

import java.util.Scanner;

public class Q6
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = input.nextInt();

        int sum = 0;
        for (int i = 1; i <= num ; i++)
        {
            boolean isFactor = num % i == 0;
            if(isFactor)
            {
                sum += i;
            }
        }
        System.out.print("Sum of all factors of a " + num + " : " + sum);
    }
}
