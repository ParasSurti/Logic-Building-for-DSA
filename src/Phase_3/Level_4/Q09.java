//Convert a string to uppercase recursively.
package Phase_3.Level_4;

import java.util.Scanner;

public class Q09
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = input.next();

        printUpp(str,str.length() - 1);
    }
    static void printUpp(String str, int n )
    {
        if(n < 0) return;
        printUpp(str,n - 1);
        System.out.println(Character.toUpperCase(str.charAt(n)));
    }
}
