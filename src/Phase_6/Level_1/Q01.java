//Print all numbers between 1 and N that are divisible by both 3 and 5.
package Phase_6.Level_1;

import java.util.Scanner;

public class Q01
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = input.nextInt();
        div(1,n);
    }
    static void div(int start , int end)
    {
        if(start > end) return ;
        if(divby3(start,end) && divby5(start,end)) System.out.print(start + " ");
        div(start + 1,end);
    }
    static boolean divby3(int start, int end)
    {
         return start % 3 == 0;
    }
    static boolean divby5(int start, int end)
    {
        return start % 5 == 0;
    }
}
