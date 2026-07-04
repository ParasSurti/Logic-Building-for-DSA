//Take two strings and print them concatenated.
package Phase_5.Level_1;

import java.util.Scanner;

public class Q07
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your First String : ");
        String str = input.nextLine();
        int l = str.length() - 1;

        System.out.print("Enter the Second String : ");
        String str2 = input.nextLine();
        int l2 = str.length() - 1;

        String first = concat(str,l);
        String second = concat(str2,l2);
        System.out.println(first + second);
    }
    static String concat(String str, int i)
    {
       if(i < 0) return "";
       return concat(str,i - 1) + str.charAt(i);
    }
}
