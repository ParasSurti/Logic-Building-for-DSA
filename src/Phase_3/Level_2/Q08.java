//Calculate the sum of first n even numbers recursively.
package Phase_3.Level_2;

import java.util.Scanner;

public class Q08
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = input.nextInt();

        int evenCount = 0;
        //System.out.println("The sum of first "+ num + " even number is " + sumEven(evenCount,1,0,num));
        int result = sumEven(num);
        System.out.println("Sum of first " + num + " even numbers : " + result);
    }
    static int sumEven( int n)
    {
        if(n == 0) return 0;
        return (2 * n) + sumEven(n - 1);
    }



//    My Approach
//    static int sumEven(int evenCount , int start, int sum ,int num)
//    {
//
//        if(evenCount == num)
//        {
//            return sum;
//        }
//        if(start % 2 == 0)
//        {
//            sum += start;
//            evenCount++;
//        }
//        return sumEven(evenCount,start + 1,sum,num);
//
//    }
}
