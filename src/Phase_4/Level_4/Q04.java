//Find the common elements between two arrays.
package Phase_4.Level_4;

import java.util.Arrays;
import java.util.Scanner;

public class Q04 extends ArrayTemplate
{
    public static void main(String[] args)
    {
        Q04 q = new Q04();
        q.setup();
        q.solve();

    }

    @Override
    void solve()
    {
        int size = sizeArray(arr1, arr2, n - 1, 0,0);
        int[] arr3 = new int[size];
        fillArray(arr1,arr2,arr3, arr2.length - 1,  arr3.length - 1);
        System.out.println("Common Element inside Both Arrays are " + Arrays.toString(arr3));
    }

    //new array size
    static int sizeArray(int[] arr1, int[] arr2, int n, int index, int count)
    {
        if(n < 0) return count;
        count = countElem(arr1,arr2[index],arr1.length - 1, count);
        return sizeArray(arr1, arr2, n - 1, index+1, count);
    }
    static int countElem(int[] arr1, int target , int n , int count)
    {
        if(n < 0) return count;
        if(arr1[n] == target) return count + 1;
        return countElem(arr1,target,n - 1, count);
    }

    //insert the common element
    static void fillArray(int[] arr1, int[] arr2, int[] arr3 ,int index, int arr3Pos)
    {
        if(index < 0) return;
        if(arr3Pos < 0) return;
        int found = findMatch(arr1,arr2[index],arr1.length - 1);
        if(found != -1)
        {
            arr3[arr3Pos] = found;
            fillArray(arr1,arr2, arr3, index - 1,arr3Pos - 1);
        }
        else
        {
            fillArray(arr1,arr2,arr3,index - 1, arr3Pos);
        }
    }
    static int findMatch(int[] arr1,int target, int n)
    {
        if(n < 0) return -1;
        if(arr1[n] == target)
        {
            return arr1[n];
        }
        return findMatch(arr1,target,n - 1);
    }


}
