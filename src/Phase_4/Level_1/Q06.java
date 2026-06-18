//Count how many elements are positive, negative, or zero.
package Phase_4.Level_1;

import java.util.Scanner;

public class Q06
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of Arrays : ");
        int n = input.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = input.nextInt();
        }

        int zero = 0;
        int positive = 0;
        int negative = 0;

        //Recursion Method
        int z = countZero(zero, arr, n - 1);
        int pos = countPositive(positive,arr,n - 1);
        int neg = countNegative(negative, arr, n- 1);

        //Printing the output
        System.out.println("Total Zero : " + z);
        System.out.println("Total Positive : " + pos);
        System.out.println("Total Negative : " + neg);

//        for (int i = 0; i < n; i++)
//        {
//            if(arr[i] > 0) positive++;
//            else if(arr[i] < 0) negative++;
//            else zero++;
//        }
//
//        System.out.println("Total Positive number : " + positive + "   \n Total Negative number : " + negative + "\n Total Zero : " + zero);

    }

    //Zero
    static int countZero(int zero, int[] arr, int n)
    {
        if(n < 0) return zero;
        zero = countZero(zero,arr,n - 1);
        if(arr[n] == 0)  zero++;
        return zero;
    }

    //Positive
    static int countPositive(int pos, int[] arr, int n)
    {
        if(n < 0) return pos;
        pos = countPositive(pos,arr,n - 1);
        if(arr[n] > 0)  pos++;
        return pos;
    }

    //Negative
    static int countNegative(int neg, int[] arr, int n )
    {
        if(n < 0) return neg;
        neg = countNegative(neg,arr,n - 1);
        if(arr[n] < 0)  neg++;
        return neg;
    }
}
