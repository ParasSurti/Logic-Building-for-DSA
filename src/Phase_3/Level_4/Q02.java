//Check if a string is palindrome using recursion.
package Phase_3.Level_4;

import java.util.Scanner;

public class Q02
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = input.nextLine();

        String rev = "";
        String pali = printRev(str,rev,str.length() - 1);

        //checking the String
        if(str.equals(pali)) System.out.print(str + " is a Palindrome String.");
        else System.out.print(str + " is not a Palindrome String!!!");

    }
    static String printRev(String str,String rev, int n)
    {
        if(n < 0) return rev;
        rev = rev + str.charAt(n);
        return printRev(str,rev, n - 1);

    }
}
