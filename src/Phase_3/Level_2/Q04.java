//Find product of digits of a number recursively.
package Phase_3.Level_2;

import java.util.Scanner;

public class Q04
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = input.nextInt();
        int ref_num = num;
        int pro = 1;
        digitProduct(num,ref_num,pro);
    }
    static void digitProduct(int num,int ref_num, int pro)
    {
        if(num !=0)
        {
            pro *= num % 10;
            num /= 10;

        }
        if(num == 0)
        {
            System.out.println("Product of the  [" + ref_num + "] Digits is " + pro);
            return;
        }
        digitProduct(num, ref_num, pro);
    }
}
