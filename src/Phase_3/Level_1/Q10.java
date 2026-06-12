//Find sum of digits of a number recursively.
package Phase_3.Level_1;

import java.util.Scanner;

public class Q10
{
    public static void main(String[] main)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = input.nextInt();

        int ref_n = 1;
        int sum = 0;
        PrintSum(n,ref_n,sum);
    }
    static void PrintSum(int n,int ref_n, int sum)
    {
        if(n != 0)
        {
            ref_n = n % 10;
            n = n / 10;
            sum += ref_n;

        }
        if(n == 0)
        {
            System.out.println(sum);
            return;
        }
        PrintSum(n,ref_n,sum);
    }
}
