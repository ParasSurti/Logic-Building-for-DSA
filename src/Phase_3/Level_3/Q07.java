//Print multiplication table of n recursively.
package Phase_3.Level_3;

import java.util.Scanner;

public class Q07
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = input.nextInt();

        int result = 1;
//        for (int j = 1; j<= 10; j++)
//        {
//            result = n * j;
//            System.out.println(n+" x "+j+" = "+result);
//        }

        printTable(n,result);
    }
    static void printTable(int num,int result)
    {
        if(result > 10) return;
        System.out.println(num + " x "+result + " = " +num * result);
        printTable(num,result + 1);
    }

}
