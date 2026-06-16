//Count vowels (AEIOU) in a string recursively.
package Phase_3.Level_4;

import java.util.Scanner;

public class Q03
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = input.nextLine();
        int count = 0;
        int total = countVow(count,str,str.length() - 1);
        System.out.print("There are total [" + total + "] vowel in " + str + " string.");
    }

    static int countVow(int count,String str, int n)
    {
        if(n < 0) return count;

        char c = Character.toLowerCase(str.charAt(n));
        switch (c)
        {
            case 'a','e','i','o','u' :
                count= count + 1;
                break;
        }
        return countVow(count,str,n - 1);
    }
}
