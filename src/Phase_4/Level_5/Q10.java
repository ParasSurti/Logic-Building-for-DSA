// Print all unique elements (those that occur exactly once).
package Phase_4.Level_5;

import java.util.HashMap;

public class Q10 extends ArrayTemplate
{
    public static void main(String[] args)
    {
        Q10 q = new Q10();
        q.setup();
        q.solve();
    }
    @Override
    void solve()
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        HashMapping(arr,map,n - 1);
        check(arr,map, n - 1);
    }
    static void HashMapping(int[] arr, HashMap<Integer,Integer> map,int n)
    {
        if(n < 0) return;
        map.put(arr[n],map.getOrDefault(arr[n],0) + 1);
        HashMapping(arr,map,n - 1);
    }
    static void check(int[] arr, HashMap<Integer,Integer> map , int n)
    {
        if(n < 0) return ;
        check(arr,map,n - 1);
        if(map.get(arr[n]) == 1)
        {
            System.out.println(arr[n]);
        }
    }
}