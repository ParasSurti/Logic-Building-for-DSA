//Calculate the sum of first n odd numbers recursively.
package Phase_3.Level_2;

import java.util.Scanner;

public class Q09
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = input.nextInt();

        int result = sumOdd(n);
        System.out.println("The Sum Of First " + n + " Odd Number is " + result);
    }
    static int sumOdd(int n)
    {
        if(n == 0) return 0;
        return (2 * n - 1) + sumOdd(n - 1);
    }
}
