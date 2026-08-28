//Find common elements between two arrays.
package Phase_6.Level_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q07
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Both Array Length : ");
        int n = input.nextInt();
        System.out.print("Fill the First Array : ");
        int[] arr1 = new int[n];

        for (int i = 0; i < n; i++)
        {
            arr1[i] = input.nextInt();
        }

        System.out.print("Fill the Second Array : ");
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr2[i] = input.nextInt();
        }


        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));


        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if(arr1[i] == arr2[j])
                {
                    arrayList.add(arr1[i]);
                }
            }
        }

        System.out.println(arrayList);
    }
}
