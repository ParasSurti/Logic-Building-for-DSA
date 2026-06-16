//Print sum of series 1 + 2 + 3 + ... + n recursively and display each step.
package Phase_3.Level_3;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Q09
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = input.nextInt();
        /*
        int sum = 0;
        for (int i = 1; i <=n ; i++)
        {
            sum = i + sum;
            for (int j = 1; j <=i; j++)
            {
                if(j == i) System.out.print(j + " = ");
                if(j < i) System.out.print(j + " + ");
            }
            System.out.println(sum);
        }
         */
        printSum (0,n);
    }

    static int printSum(int sum,int row)
    {
        if(row == 0) return row;
        printSum(sum,row - 1);
        sum = printNum(sum,row);
        printSeq(row);
        System.out.println( " = " + sum);
        return sum;
    }
    static int printNum(int sum,int col)
    {
        if(col == 0) return sum;
        return printNum(sum + col, col - 1 );
    }
    static void printSeq(int col)
    {
        if(col == 0) return ;
        printSeq(col - 1);
        if(col == 1) System.out.print(col + "");
        else System.out.print(" + " + col );
    }

}