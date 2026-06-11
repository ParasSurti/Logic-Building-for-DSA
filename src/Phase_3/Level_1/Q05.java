//Print sum of first n natural numbers recursively.
package Phase_3.Level_1;

import java.util.Scanner;

public class Q05
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the nth number : ");
        int n = input.nextInt();

        //Recursion
        int start = 1;
        int sum = 0;
        printNnum(sum,start,n);
    }
    static void printNnum(int sum,int start, int n )
    {
        if(n > 0)
        {
            sum += start;
        }
        if(start == n)
        {
            System.out.print("The Sum of all the natural number till " + n +" : " + sum );
            return;
        }
        printNnum(sum,start + 1, n);
    }
}
