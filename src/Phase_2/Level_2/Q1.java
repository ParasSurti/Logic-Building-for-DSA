//Count the number of digits in a given number.
package Phase_2.Level_2;

import java.util.Scanner;

public class Q1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = input.nextInt();
        int value = num;
        int count = 0;
        int temp = 1;
        for (int i = 0; num != 0 ; i++)
        {
            temp = num % 10;
            num /= 10;
            count++;
        }
        System.out.println("The number [" + value +"] contains "+ count +" Digit.");
    }
}
