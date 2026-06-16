//Reverse a string using recursion.
package Phase_3.Level_4;

import java.util.Scanner;

public class Q01
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = input.nextLine();

        printStr(str,str.length()- 1);
    }
    static void printStr(String str,int n)
    {
        if(n < 0) return;
        System.out.print(str.charAt(n));
        printStr(str,n - 1);
    }
}
