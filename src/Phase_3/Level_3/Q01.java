//Print a line of n stars recursively.
package Phase_3.Level_3;

import java.util.Scanner;

public class Q01
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the n : ");
        int n = input.nextInt();

        printLine(0,n);
    }
    static void printLine(int count ,int n)
    {
        if(count == n) return ;
        System.out.print("*");
        printLine(count + 1,n);
    }
}
