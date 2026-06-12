//Find GCD (HCF) of two numbers using Euclid’s algorithm recursively.
package Phase_3.Level_2;

import java.util.Scanner;

public class Q05
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        int num1 = input.nextInt();
        System.out.print("Enter 2nd Number : ");
        int num2 = input.nextInt();

        int ans = GCD(num1,num2);
        System.out.print("The GCD of  [" + num1 + ", " + num2 + "] : " + ans);
    }
    static int GCD(int a ,int b)
    {
        if(b == 0)
        {
            return a;
        }
        return GCD( b, a  % b);


        //Second Approach
//        if(b != 0)
//        {
//            int temp = a % b;
//            a = b;
//            b = temp;
//        }
//        if(b == 0)
//        {
//            System.out.println("The GCD of [" + ref_num1 + ", "+ ref_num2 + "] : " +  a);
//            return ;
//        }
//        GCD(a,b,ref_num1,ref_num2);
    }
}
