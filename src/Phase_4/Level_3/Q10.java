//Copy one array to another manually.
package Phase_4.Level_3;

import java.util.Arrays;
import java.util.Scanner;

public class Q10
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the Array : ");
        int n = input.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = input.nextInt();
        }

        int[] newArr = new int[n];
        copy(arr,newArr,n - 1);
        System.out.print(Arrays.toString(newArr));
    }
    static void copy(int[] arr,int[] newArr, int n)
    {
        if(n < 0) return;
        copy(arr,newArr,n - 1);
        newArr[n] = arr[n];
    }
}
