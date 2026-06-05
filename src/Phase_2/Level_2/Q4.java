//Find the sum of digits of a number.
package Phase_2.Level_2;

import java.util.Scanner;

public class Q4
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = input.nextInt();
        int value = num;

        int store = 0;
        for (int i = 0; num != 0; i++)
        {
            int temp = num % 10;
            store += temp;
            num /= 10;
        }
        System.out.println("The sum of the " + value + " : " + store );
    }
}
