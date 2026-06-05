//Take three numbers and print the median value (neither maximum nor minimum).
package Phase_1.Level_4;

import java.util.Arrays;
import java.util.Scanner;

public class Q3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three number : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        int median = num1 + num2 + num3 - Math.max(num1, Math.max(num2, num3)) - Math.min(num1 , Math.min(num2,num3));

        System.out.println(median + " is the median.");
    }
}
