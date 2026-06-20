//Find the count of prime numbers in the array.
package Phase_4.Level_2;

import java.util.Scanner;

public class Q08
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = input.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = input.nextInt();
        }

        int count = 0;
        int check = countPrime(arr, count, n - 1);

        System.out.println("There are total " + check + " in the arrays!!");
    }
    //Counting Prime number Iteratively
    static int countPrime(int[] arr,int count, int n)
    {
        int start = 2;
        if(n < 0) return count;
        count = countPrime(arr, count, n - 1);
        if( prime(arr[n],start) ) count += 1;
        else return count;
        return count;
    }

    //Checking if it is Prime number
    static boolean prime(int element,int start)
    {
        if(element < 2) return false;
        if(element == start) return true;
        if(element % start == 0) return false;
        return prime(element,start+ 1);
    }
}
