//Find elements that are in one array but not in the other.
package Phase_4.Level_4;

import java.util.Arrays;

public class Q05 extends ArrayTemplate
{
    public static void main(String[] args)
    {
        Q05 q = new Q05();
        q.setup();
        q.solve();
    }
    @Override
    void solve()
    {
        //figuring the size the array should have
        int size = sizeArr(arr1,arr2,n - 1,0,0);
        int[] arr3 = new int[size];

        //filling the new array (elements that are in one array but not in the other.)
        fill(arr1,arr2,arr3, n - 1,0,0);
        System.out.println("Elements that are in one array but not in the other : " + Arrays.toString(arr3) );
    }

    //Size for Array
    static int sizeArr(int[] arr1, int[] arr2, int n, int index, int count)
    {
        if(n < 0 ) return count;
        //search arr1 while keeping arr2 as compare element.
        if(!arr2Search(arr2,arr1[index], arr2.length - 1))
        {
            count += 1;
        }
        //search arr2 while keeping arr1 as compare element.
        if(!arr1Search(arr1, arr2[index], arr1.length - 1))
        {
            count += 1;
        }
        return sizeArr(arr1,arr2,n - 1, index + 1,count);
    }
    static boolean arr1Search(int[] arr1, int target, int n)
    {
        if(n < 0) return false;
        if(arr1[n] == target)
        {
            return true;
        }
        return arr1Search(arr1, target, n - 1);
    }
    static boolean arr2Search(int[] arr2, int target, int n)
    {
        if(n < 0) return false;
        if(arr2[n] == target)
        {
            return true;
        }
        return arr2Search(arr2, target, n - 1);
    }

    //Fill the Array
    static void fill(int[] arr1, int[] arr2, int[] arr3, int n, int index, int count)
    {
        if(n < 0) return;
        if(!arr2Search(arr2,arr1[index],arr2.length - 1))
        {
            arr3[count] = arr1[index];
            count++;
        }
        if(!arr1Search(arr1,arr2[index],arr1.length - 1))
        {
            arr3[count] = arr2[index];
            count++;
        }
        fill(arr1,arr2,arr3,n - 1,index + 1, count);
    }

}
