//Count how many positive, negative, and zero elements are in an array.
package Phase_6.Level_3;

import java.util.Scanner;

public class Q02
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int n = input.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n ; i++)
        {
            arr[i] = input.nextInt();
        }

        //Count
        int countPos = 0;
        int countNeg = 0;
        int countZero = 0;

        for (int i = 0; i < n; i++)
        {
            if(arr[i] > 0) countPos++;
            else if(arr[i] < 0) countNeg++;
            else countZero++;
        }
        System.out.println("Total Positive Element : " + countPos);
        System.out.println("Total Negative Element : " + countNeg);
        System.out.println("Total Zero Element : " + countZero);
    }
}
