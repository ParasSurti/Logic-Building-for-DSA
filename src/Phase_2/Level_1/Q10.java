//Print the product of digits of a given number
package Phase_2.Level_1;

import java.util.Scanner;

public class Q10
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = input.nextInt();
        int value = num;
        int product = 1;
        int temp = 1;
        for (int i = num; num != 0; i++)
        {

            temp = num % 10;
            product *= temp;
            num = num / 10;
        }
        System.out.println("Product of Digit " + value + " : " + product);
    }
}
