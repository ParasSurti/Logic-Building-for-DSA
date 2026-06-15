//Print a square of stars recursively (n×n).
package Phase_3.Level_3;

import java.util.Scanner;

public class Q02
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the n : ");
        int n = input.nextInt();

//        for (int i = 0; i < n; i++)
//        {
//            for (int j = 0; j < n; j++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        Square(1,0,n);
    }
    static void Square(int row, int col ,int n)
    {
        printStar(row,col,n);
        System.out.println();
        if(row == n) return;
        Square(row + 1,col,n);
    }
    static void printStar(int row,int col,int n)
    {
        if(col == n) return;
        System.out.print("*");
        printStar(row,col + 1,n);
    }
}
