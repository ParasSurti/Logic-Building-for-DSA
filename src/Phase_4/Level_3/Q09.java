//Swap alternate elements (1st ↔ 2nd, 3rd ↔ 4th, etc.).
package Phase_4.Level_3;

import java.util.Arrays;
import java.util.Scanner;

public class Q09
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

            // Looping
//        for (int i = 0; i < n; i++)
//        {
//            newArr[i] = arr[i];
//        }
//        int j = 1;
//        for (int i = 0; j < n; i+=2)
//        {
//            int temp = newArr[i];
//            newArr[i] = newArr[j];
//            newArr[j] = temp;
//            j += 2;
//        }

        //Recursion
        alternate(arr,newArr,n - 1);
        swap(newArr,n - 1,0,1);
        System.out.println(Arrays.toString(newArr));
    }
    static void alternate(int[] arr, int[] newArr, int n)
    {
        if(n < 0) return ;
        alternate(arr,newArr,n - 1);
        newArr[n] = arr[n];
    }
    static void swap(int[] newArr,int n,int i, int j)
    {
        if(j > n) return;
        if(j < n)
        {
            int temp = newArr[i];
            newArr[i] = newArr[j];
            newArr[j] = temp;
        }
        swap(newArr,n,i + 2, j + 2);

    }
}
