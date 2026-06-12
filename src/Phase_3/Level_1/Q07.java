//Calculate power of a number (xⁿ) using recursion.
package Phase_3.Level_1;

import java.util.Scanner;

public class Q07
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number (xⁿ): ");
        int x = input.nextInt();

        System.out.print("Enter the Power (xⁿ): ");
        int n = input.nextInt();

        printPower(x, n, 1 , 0);

    }

     static void printPower(int x, int n, int result, int count)
    {
        result = result * x;
        count += 1;
//        System.out.println("result : "+result + ", x : " + x);
        if(count == n)
        {
            System.out.println(x + " raise to power " + n + " : " + result);
            return ;
        }
        printPower(x, n, result, count);
    }

}
