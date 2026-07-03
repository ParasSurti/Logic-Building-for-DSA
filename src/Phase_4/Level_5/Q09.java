//Print the frequency of each distinct element.
package Phase_4.Level_5;

import java.util.Arrays;
import java.util.HashMap;

public class Q09 extends ArrayTemplate
{
    public static void main(String[] args)
    {
        Q09 q = new Q09();
        q.setup();
        q.solve();
    }
    @Override
    void solve()
    {
        int max = largestElement(arr,n - 1,Integer.MIN_VALUE);
        int[] newArr = new int[max + 1];

        HashMap<Integer,Integer> map = new HashMap<>();
        mapping(arr,map,n - 1);

        System.out.println(map);
    }
    static int largestElement(int[] arr, int n, int store)
    {
        if(n < 0) return store;
        store = Math.max(store,arr[n]);
        return largestElement(arr, n - 1,store);
    }
    static void mapping(int[] arr, HashMap<Integer, Integer> map, int n)
    {
        if(n < 0) return;
        map.put(arr[n],map.getOrDefault(arr[n],0) + 1);

        mapping(arr,map,n - 1);
    }
}
