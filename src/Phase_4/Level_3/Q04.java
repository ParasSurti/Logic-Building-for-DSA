//Replace all even numbers with 1 and all odd with 0.
package Phase_4.Level_3;

import java.util.Arrays;
import java.util.Scanner;

public class Q04
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = input.nextInt();


        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = input.nextInt();
        }
        int[] newArr = new int[n];
        newArr(arr,newArr, n - 1);
        System.out.println(Arrays.toString(newArr));
    }
    static void newArr(int[] arr,int[] result, int n)
    {
        if(n < 0) return;
        newArr(arr,result, n - 1);
        result[n] = arr[n] % 2 == 0 ? 1 : 0;
    }
}
