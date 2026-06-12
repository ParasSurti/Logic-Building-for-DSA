//Find nth Fibonacci number recursively
package Phase_3.Level_1;

import java.util.Scanner;

public class Q08
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the nth number : ");
        int n = input.nextInt();

        int a = 0;
        int b = 1;
        int sum = 0;
        //logic
//        for (int i = 0; i <= n ; i++)
//        {
//            System.out.println(sum);
//            sum = a + b;
//            a = b;
//            b = sum;
//        }

        printFibo(n,a,b,sum,0);
    }
    static void printFibo(int n , int a,int b,int sum, int count)
    {
        //exit Recursion (Base case)
        if(count == n)
        {
            System.out.println(sum);
            return;
        }
        sum = a + b;
        a = b;
        b = sum;
        count++;
        printFibo(n,a,b,sum,count);
    }
}
