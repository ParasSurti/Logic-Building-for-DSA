//Check if all elements in an array are unique.
package Phase_4.Level_2;

import java.util.Scanner;

public class Q05
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

//        Loop Version
//        boolean check = true;
//        for (int i = 0; i < n - 1; i++)
//        {
//            for (int j = i + 1; j < n; j++)
//            {
//                if (arr[i] == arr[j]) {
//                    check = false;
//                    break;
//                }
//            }
//        }

        boolean check = isUnique(arr,0,1,n);
        if(!check)
        {
            System.out.println("It's Unique!!");
        }
        else
        {
            System.out.println("It's not Unique!! ");
        }
    }

    static boolean isUnique(int[] arr, int i , int j , int n)
    {
        if(i >= n - 1) return true;

        if(j >= n) return  isUnique(arr,i + 1, i + 2, n);

        if(arr[j] == arr[i]) return true;

        return isUnique(arr, i , j+1,n);
    }
}
