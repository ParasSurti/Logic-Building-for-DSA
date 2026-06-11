//Print only even numbers from 1 to n recursively.
package Phase_3.Level_1;

import java.util.Scanner;

public class Q03
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the nth number : ");
        int n = input.nextInt();

        int start = 1;
        printEven(start,n);
    }
    static void printEven(int start , int n)
    {
        if(start % 2 == 0)
        {
            System.out.print(start + " ");
        }

        if(start == n)
        {
            return ;
        }
        printEven(start + 1,n);

    }
}
