//Print pattern of characters (A, AB, ABC, ...) recursively.
package Phase_3.Level_3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Q10
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size (n) : ");
        int n = input.nextInt();

        char start = 'A' ;
        printABC(start, n);
    }
    static void printABC(char a , int n)
    {
        if(n == 0) return;
        printABC(a,n - 1);
        printchar(a,n);
        System.out.println();

    }
    static void printchar(char a,int col)
    {
        if(col == 0)
        {
            return;
        }
        printchar(a,col - 1);
        System.out.print((char) (a + col - 1));
    }

}
