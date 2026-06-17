//Print the string in reverse order recursively (without using loops).
package Phase_3.Level_4;

import java.util.Scanner;

public class Q08
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = input.next();

        printRev(str,str.length() - 1);
    }
    static void printRev(String str, int n)
    {
        if(n < 0) return;
        System.out.println(str.charAt(n));
        printRev(str,n - 1);

    }
}
