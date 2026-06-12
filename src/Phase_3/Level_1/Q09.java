//Print Fibonacci series up to n terms recursively.
package Phase_3.Level_1;

import java.util.Scanner;

public class Q09
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = input.nextInt();

        int sum = 0;
        int a = 0;
        int b = 1;
        int count = 1;
        printFibo(sum,n,a,b,count);
    }
    static void printFibo(int sum, int n , int a, int b, int count)
    {
        System.out.println(sum);
        sum = a + b;
        a = b;
        b = sum;
        if(count == n)
        {
            return;
        }
        count++;
        printFibo(sum,n,a,b,count);
    }
}
