//Count the number of digits in a number recursively
package Phase_3.Level_2;

import java.util.Scanner;


public class Q01
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = input.nextInt();
        int reference_num = num;
        int refNum = 1;
        int count = 0;
        CountDigit(reference_num,num,count);
    }

    static void CountDigit(int reference_num,int num, int count)
    {
        if(num != 0)
        {
            num /= 10;
            count++;
        }
        if(num == 0)
        {
            System.out.println(reference_num + " has total " + count + " Digits.");
            return;
        }
        CountDigit(reference_num,num,count);
    }
}
