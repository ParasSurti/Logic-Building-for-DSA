//Input an element x — check if it exists in the array.
package Phase_4.Level_2;

import java.util.Scanner;

public class Q01
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

        //Enter the number
        System.out.print("Enter the element : ");
        int x = input.nextInt();


        boolean check_value = check(arr,n - 1,x);
        if(check_value) System.out.println("Yes, It Exits!!");
        else System.out.println("No, It Doesn't Exits!!");

    }
    static boolean check(int[] arr, int n, int x)
    {
        if(n < 0) return false;
        if(x == arr[n]) return true;
        return check(arr,n - 1, x);
    }
}
