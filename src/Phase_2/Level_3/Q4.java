//Find HCF (GCD) of two numbers using loops.
package Phase_2.Level_3;

import java.util.Scanner;

public class Q4
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your 1st number : ");
        int a = input.nextInt();

        System.out.print("Enter your 2nd number : ");
        int b = input.nextInt();

        int hcf = 1;
        for (int i = 1; i <= Math.min(a,b);  i++)
        {
            if(a % i == 0 && b % i == 0)
            {
                hcf = i;
            }
        }
        System.out.println("HCF of (" + a + ", " + b + ") : " + hcf );
    }
}
