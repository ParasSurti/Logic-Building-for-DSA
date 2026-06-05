//Print all numbers between a and b divisible by 7.
package Phase_2.Level_3;

import java.util.Scanner;

public class Q3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your 1st Number : ");
        int a = input.nextInt();
        System.out.print("Enter your 2nd Number : ");
        int b = input.nextInt();

        for (int i = 1; i >= a && i <= b; i++)
        {
            boolean isDiv7 = i % 7 == 0;
            if(isDiv7)
            {
                System.out.println(i);
            }
        }
    }
}
