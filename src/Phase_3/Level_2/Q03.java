//Check if a number is a palindrome using recursion.
package Phase_3.Level_2;

import java.util.Scanner;

public class Q03
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = input.nextInt();
        int ref_num = num;
        int rev = 0;
        printPali(num,ref_num,rev);
    }
    static void printPali(int num,int ref_num, int rev)
    {
        if(num != 0)
        {
            rev = (rev * 10) + (num % 10);
            num /= 10;
        }
        if(num == 0)
        {
            if(ref_num == rev)
            {
                System.out.println("Yes!!");
                System.out.println("The given number [" + ref_num + "] is a Palindrome number.");
            }
            else
            {
                System.out.println("NO!!");
                System.out.println("The given number [" + ref_num + "] is a not a Palindrome number.");
            }
            return;
        }
        printPali(num, ref_num, rev);
    }
}
