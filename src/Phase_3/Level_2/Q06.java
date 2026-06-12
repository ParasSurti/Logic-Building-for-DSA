//Convert a number to binary recursively.
package Phase_3.Level_2;

import java.util.Scanner;

public class Q06
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = input.nextInt();

        int sum = 0;
//        int ans = printBinary(sum,num);
        System.out.println("Binary number for "+ num  + " is " + printBinary(sum,num));
    }
    static int printBinary(int sum,int num)
    {
        if(num == 0)
        {
            return sum;
        }
        sum = printBinary(sum,num / 2);
        sum = (sum* 10) + (num % 2);
        return sum;

    }
}
