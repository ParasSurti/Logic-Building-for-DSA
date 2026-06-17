//Remove all spaces from a string recursively.
package Phase_3.Level_4;

import java.util.Scanner;

public class Q04
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = input.nextLine();
        printStr(str,str.length() - 1);
    }

    static void printStr(String str,int n)
    {
        if(n < 0)
        {
            return;
        }
        printStr(str,n-1);
        remSpac(str,n);
    }
    static void remSpac(String str, int n)
    {
        if(str.charAt(n) == ' ')
        {
            return;
        }
        System.out.print(str.charAt(n));
    }
}
