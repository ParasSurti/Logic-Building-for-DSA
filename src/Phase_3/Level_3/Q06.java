//Print reverse triangle pattern recursively.
package Phase_3.Level_3;

import java.util.Scanner;

public class Q06
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter he number : ");
        int n = input.nextInt();

        Triangle(n);
    }
    static void Triangle(int row)
    {
        if(row == 0) return;
        printRev(row);
        System.out.println();
        Triangle(row - 1);
    }
    static void printRev(int col)
    {
        if(col == 0) return;
        System.out.print("* ");
        printRev(col - 1);
    }
}
