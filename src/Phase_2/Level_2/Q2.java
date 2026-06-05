//Print the reverse of a given number.
package Phase_2.Level_2;

import java.util.Scanner;

public class Q2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = input.nextInt();

        int rev = 0;
        int value = num;
        for (int i = num;  num != 0; i++)
        {
            int temp = num % 10;
            num = num / 10;
            rev = (rev * 10) + temp;
        }
        System.out.print(rev);
    }
}