//Print a Left Aligned Triangle with Sequence of Number (1,2,3,4,5,6,7,8,9,0) & start again if hit num finish.
package Phase_2.Level_4;

import java.util.Scanner;

public class Q14
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = input.nextInt();

        //First Approach
        int num = 1;
        for (int i = 1; i <= n ; i++)
        {
            for (int j = 1; j <=i; j++)
            {
                System.out.print((num % 10) + " ");
                num++;
            }
            System.out.println();
        }


        //Second Approach
//        int num = 1;
//        for (int i = 1; i <= n; i++)
//        {
//            for (int j = 1; j <= i ; j++)
//            {
//                if(num <= 9)
//                {
//                    System.out.print(num + " ");
//                }
//                else
//                {
//                    num = 0;
//                    System.out.print(num + " ");
//                }
//                num++;
//            }
//            System.out.println();
//        }

    }
}
