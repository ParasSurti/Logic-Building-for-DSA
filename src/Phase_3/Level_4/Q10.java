// Count consonants and vowels(a, e, i, o, u) separately using recursion.
package Phase_3.Level_4;

import java.util.Scanner;

public class Q10
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = input.next();
        int count = 0;

        /*
        int count = 0;
        int n = str.length() - 1;
        for (int i = 0; i < n; i++)
        {
            switch (Character.toUpperCase(str.charAt(i)))
            {
                case 'A','E','I','O','U' :
                    count += 1;
                    break;
            }
        }
        total = n - count;
        total += 1;
        System.out.println("There are total : " + count + "\n & consonants : " + total +" in this [" + str + "] String.");
        */

        int store = allString(str,str.length() - 1,count);
        System.out.println("There are total " + store + " vowels (a, e, i, o, u) in ["+str+"] String.");
        int total = str.length() - store;
        System.out.println("There are total " + total + " consonants in [" + str + "] String.");
    }

    static int allString(String str, int n,int count)
    {
        if(n < 0) return count;
        count = allString(str,n - 1,count);
        switch (Character.toUpperCase(str.charAt(n)))
        {
            case 'A','E','I','O','U' :
                count = count + 1;
        }
        return count;
    }
}
