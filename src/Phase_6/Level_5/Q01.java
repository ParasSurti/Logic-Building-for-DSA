//Given marks of students, find how many passed (>= 40).
package Phase_6.Level_5;

import java.util.Scanner;

public class Q01
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Total Element in Array: ");
        int n = input.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
        {
            arr[i] = input.nextInt();
        }

        int totalPass = check(arr,n,0);
        System.out.println("Total Students who have pass : " + totalPass );

    }
    static int check(int[] arr, int n, int i)
    {
        if(i >= n) return 0;
        if(arr[i] >= 40) return check(arr,n,i + 1) + 1;
        return check(arr,n,i + 1);
    }
}
