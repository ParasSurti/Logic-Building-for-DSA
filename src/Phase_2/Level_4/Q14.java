//Print a Left-Aligned Triangle with numbers 1-9, reset to 0 after 9 and repeat.
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
