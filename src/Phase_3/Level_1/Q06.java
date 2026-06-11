//Print factorial of a number recursively.
package Phase_3.Level_1;

import java.util.Scanner;

public class Q06
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = input.nextInt();

        int num = n;
        int count = 1;
        int fact = 1;
        printFact(count, fact, n, num);

    }
    static void printFact(int count ,int fact , int n , int num)
    {

        if(n > 0)
        {
            fact = fact * n;
        }
        if(count == num)
        {
            System.out.println("Factorial of "+ num +" is "+ fact );
            return;
        }
        count++;
        printFact(count,fact,n - 1 , num);
    }
}