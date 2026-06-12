//Reverse a number recursively.
package Phase_3.Level_2;

import java.util.Scanner;

public class Q02
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = input.nextInt();

        int rev = 0;
        int ref_num = num;
        PrintRev(num,ref_num,rev);
    }

    static void PrintRev(int num, int ref_num, int rev)
    {
        if(num != 0)
        {
            rev = (rev * 10) + (num % 10);
            num /= 10;
        }
        if(num == 0)
        {
            System.out.print("The Reverse of " + ref_num + " is '" + rev +"'.");
            return;
        }
        PrintRev(num, ref_num, rev);
    }
}
