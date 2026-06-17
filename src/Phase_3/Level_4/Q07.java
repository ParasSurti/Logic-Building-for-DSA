//Print all characters of a string one by one recursively.
package Phase_3.Level_4;

import java.util.Scanner;

public class Q07
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = input.next();

        printStr(str,str.length()-1);
    }
    static void printStr(String str,int n )
    {
        if(n < 0) return ;
        printStr(str,n - 1);
        System.out.println(str.charAt(n));
    }
}
