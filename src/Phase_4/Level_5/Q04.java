//Find the second smallest element in an array.
package Phase_4.Level_5;

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
        if (n < 2)
        {
            System.out.println("Second smallest element does not exist.");
            return;
        }

        int[] arr2 = new int[n];
        int small = newArr2(arr,arr2,n - 1, Integer.MAX_VALUE);
        int sec = smallest(arr2,n-1,Integer.MAX_VALUE,small);
        System.out.println("Second Smallest Element in the Array : " + sec);
    }
    static int newArr2(int[] arr,int[] arr2, int n , int store)
    {
        if(n < 0) return store;

        //fill new Array
        arr2[n] = arr[n];

        //Checking the smallest
        store = Math.min(arr[n],store);
        return newArr2(arr,arr2,n - 1, store);
    }
    static int smallest(int[] arr2, int n, int store,int small)
    {
        if(n < 0) return store;
        if(arr2[n] == small)
        {
            arr2[n] = Integer.MAX_VALUE;
        }
        store = Math.min(arr2[n],store);
        return smallest(arr2,n - 1, store,small);
    }
}