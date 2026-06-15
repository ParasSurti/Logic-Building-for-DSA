//Print pattern of numbers recursively (1 to n each row).
package Phase_3.Level_3;

import java.util.Scanner;

public class Q05
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Nth number : ");
        int n = input.nextInt();

        printNumb(n);
    }
    static void printNumb(int row)
    {
        if(row == 0) return;
        printNumb(row - 1);

        printDigit(row);
        System.out.println();

    }
    static void printDigit(int col)
    {
        if(col == 0) return ;
        printDigit(col - 1);
        System.out.print(col);

    }
}
