// Take 5 numbers as input. If the user enters 0, skip it using continue. At the end, print the sum of all non-zero numbers entered.
package Phase_2.Level_5;

import java.util.Scanner;

public class Q10
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 5 number ");
        int sum = 0;
        for (int i = 1; i <= 5 ; i++)
        {

            int num = input.nextInt();
            if(num == 0  )
            {

                continue;
            }
            sum += num;
        }
        System.out.println("Sum : " + sum);
    }

}
