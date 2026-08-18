//Print all unique elements from an array.
package Phase_6.Level_3;

import java.util.Scanner;

public class Q03
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


        //Find Unique
        for (int i = 0; i < n; i++)
        {
            boolean isUnique = true;
            for (int j = i; j < n; j++)
            {
                if(i == j) continue;
                if(arr[i] == arr[j])
                {
                    isUnique = false;
                    break;
                }
            }
            if(isUnique)
                System.out.println(arr[i] + " ");
        }
    }
}
