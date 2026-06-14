//Print a triangle of stars recursively (top-down).
package Phase_3.Level_3;

import java.util.Scanner;

public class Q03
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Nth number : ");
        int n = input.nextInt();
        Triangle(n);
    }
    static void Triangle(int row)
    {
        if(row == 0) return;
        printStar(row);
        System.out.println();
        Triangle(row - 1);
    }
    static void printStar(int col)
    {
        if(col == 0) return;
        System.out.print("*");
        printStar(col - 1);
    }
}
