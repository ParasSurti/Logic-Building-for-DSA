//Compare two strings lexicographically (like dictionary order).
package Phase_5.Level_1;

import java.util.Scanner;

public class Q08
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first String : ");
        String str = input.nextLine();

        System.out.print("Enter the Second String : ");
        String str2 = input.nextLine();

        int first = cmp(str,str2,0);
        System.out.println(first);
    }
    static int cmp(String str,String str2,int i)
    {
        if(i == str.length() && i == str2.length())
            return 0;
        if(i == str.length())
            return -1;
        if(i == str2.length())
            return 1;

        if(str.charAt(i) > str2.charAt(i))
            return 1;
        else if(str.charAt(i) < str2.charAt(i))
            return -1;
        return cmp(str,str2,i + 1);
    }
}
