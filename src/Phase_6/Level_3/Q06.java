//Count how many elements are even at an even index.
package Phase_6.Level_3;

import java.util.Scanner;

public class Q06
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



        int count = 0;
        for (int i = 0; i < n; i++)
        {
            if (i % 2 == 0 && arr[i] % 2 == 0) {
                count++;
            }
        }

        System.out.println("Total Elements that are Even at Even Index : " + count );
    }
}
