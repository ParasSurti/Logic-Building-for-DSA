// Print sum of first n terms of Fibonacci series
package Phase_2.Level_2;

import java.util.Scanner;

public class Q10
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = input.nextInt();

        int a = 0;
        int b = 1;

        int sum = 0;
        for (int i = 0; i < num; i++)
        {
            //System.out.println(a + " ");
            sum += a;
            int next = a + b ;
            a = b ;
            b = next;

        }
        System.out.println("SUM : " + sum);
    }
}
