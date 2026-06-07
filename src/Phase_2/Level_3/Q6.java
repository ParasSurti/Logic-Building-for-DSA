//Print all factors of a given number.
package Phase_2.Level_3;

import java.util.Scanner;

public class Q6
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = input.nextInt();

        for (int i = 1; i <= num; i++)
        {
            boolean isFactor = num % i  == 0;
            if (isFactor)
            {
                System.out.print(i + " ");
            }

        }
    }
}
