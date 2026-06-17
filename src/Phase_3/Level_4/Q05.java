//Replace all occurrences of a character (say ‘a’ → ‘x’) recursively.
package Phase_3.Level_4;

import java.util.Scanner;

public class Q05
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = input.nextLine();

        printStr(str,str.length() - 1);
    }
    static void printStr(String str, int n)
    {
        if(n < 0 ) return;
        printStr(str,n - 1);
        replaceStr(str,n);
    }
    static void replaceStr(String str, int n)
    {
        if(str.charAt(n) == 'a')
        {
            System.out.print('x');
            return;
        }
        System.out.print(str.charAt(n));
    }
}
