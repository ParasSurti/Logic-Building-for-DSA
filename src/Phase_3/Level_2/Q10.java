//Find nCr (Combination formula) recursively using Pascal’s relation.
package Phase_3.Level_2;

import java.util.Scanner;

public class Q10
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the n : ");
        int n = input.nextInt();

        System.out.print("Enter the r : ");
        int r = input.nextInt();

        if(r > n)
        {
            System.out.print("r cannot exceed n!");
            return;
        }
        int result = nCr(n,r);
        System.out.print("By using Pascal's relation the nCr is " + result);
    }
    static int nCr(int n, int r)
    {
       if(r == 0 || r == n) return 1;
       return nCr(n - 1, r - 1) + nCr(n-1,r);
    }
}
