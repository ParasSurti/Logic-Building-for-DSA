//Remove all occurrences of a character from a string recursively.
package Phase_3.Level_4;

import java.util.Scanner;

public class Q06
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = input.nextLine();
        System.out.print("Enter the Occurence character : ");
        char occ = input.next().charAt(0);

        printStr(str,str.length() - 1,occ);
        System.out.println();
    }
    static void printStr(String str, int n ,char occ)
    {
        if(n < 0) return;
        printStr(str, n - 1, occ);
        remspec(str,n,occ);
    }
    static void remspec(String str,int n , char occ)
    {
        if(str.charAt(n) == occ)
        {
            return;
        }
        System.out.print(str.charAt(n));
    }
}
