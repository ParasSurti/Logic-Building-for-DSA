// Print numbers from n down to 1 using recursion.
package Phase_3.Level_1;

import java.util.Scanner;

public class Q02
{
    public static void main(String[] args)
    {
        //User's input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the nth Number : ");
        int n = input.nextInt();

        int end = 1;
        printNum(n, end);
    }
    static void printNum(int n , int end)
    {
        if(n == end)
        {
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " ");
        printNum(n - 1, end);
    }
}
