package Phase_4.Level_4;

import java.util.Arrays;
import java.util.Scanner;


public abstract class ArrayTemplate
{
    Scanner input = new Scanner(System.in);
    int[] arr1,arr2;
    int n ;

    void setup()
    {
        System.out.println("Enter the size of Array :");
        n = input.nextInt();

        arr1 = new int[n];
        System.out.println("Enter elements of Arrays 1 : ");
        for (int i = 0; i < n; i++) arr1[i] = input.nextInt();

        arr2 = new int[n];
        System.out.println("Enter elements of Arrays 2 : ");
        for (int i = 0; i < n; i++) arr2[i] = input.nextInt();

        System.out.println("Array 1 : " + Arrays.toString(arr1));
        System.out.println("Array 2 : " +  Arrays.toString(arr2));
    }
    abstract void solve();
}

