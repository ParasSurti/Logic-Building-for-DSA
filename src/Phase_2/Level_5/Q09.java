//Print the sum of all odd digits and even digits separately in a number.
package Phase_2.Level_5;

import java.util.Scanner;

public class Q09
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = input.nextInt();
        int num1 = num;
        int sumEven = 0;
        int sumOdd = 0;
        while(num != 0) {
            int temp = num % 10;
            if (temp % 2 == 0) {
                sumEven += temp;
            } else {
                sumOdd += temp;
            }
            num /= 10;
        }
        System.out.println("Sum of Even number in this Number (" + num1 + ") is " + sumEven );
        System.out.println("Sum of Odd number in this Number (" + num1 + ") is " + sumOdd );
    }
}
