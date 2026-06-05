// Check whether a number is a perfect square (without using the square root function).
package Phase_1.level_3;

import java.util.Scanner;

public class Q10
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = input.nextInt();

        if(num < 0)
        {
            System.out.println(num + " is not a perfect square.");
        }

        int sq = 0;
        for (int i = 1; sq < num; i++)
        {
             sq = i * i;
        }
        if(sq == num)
        {
            System.out.println(num + " is Perfect square!");
        }
        else
        {
            System.out.println(num + " is not a perfect square");
        }
    }
}
