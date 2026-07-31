//Print characters that appear more than once (without map).
package Phase_6.Level_2;

import Phase_6.OneStringTemplate;

import java.util.HashMap;
import java.util.Map;

public class Q05 extends OneStringTemplate
{
    public static void main(String[] args)
    {
        Q05 q = new Q05();
        q.setup();
        q.solve();
    }
    @Override
    protected void solve()
    {
        //With Map
//        Map<Character,Integer> map = new HashMap<Character,Integer>();
//
//        for (int i = 0; i < str.length(); i++)
//        {
//            char ch = str.charAt(i);
//            if(map.containsKey(ch))
//            {
//                map.put(ch,map.get(ch) + 1);
//            } else {
//                map.put(ch,1);
//            }
//        }
//
//        for (int i = 0; i < str.length(); i++)
//        {
//            char ch = str.charAt(i);
//
//            if(map.get(ch) > 1)
//            {
//                System.out.print(ch);
//                map.put(ch,0);
//            }
//        }


        //Without Map
        char[] arr = str.toCharArray();
        String print = printCh(arr,str,0);
        System.out.println(print);
    }
    static String printCh(char[] arr,String str, int start)
    {
        if(start >= str.length()) return "";
        char ch = str.charAt(start);
        if(check(arr,ch,0,0) && first(str,ch,0,start))
        {
            return ch + printCh(arr,str,start + 1);
        }
        return printCh(arr,str,start + 1);
    }
    static boolean check(char[] arr,char ch, int start, int count)
    {
        if(start >= arr.length) return count > 1;
        if(ch == arr[start])
        {
            count ++;
        }
        return check(arr,ch, start + 1, count);
    }
    static boolean first(String str, char ch, int current, int start)
    {
        if(current >= start) return true;
        if(str.charAt(current) == ch)
        {
            return false;
        }
        return first(str,ch,current + 1, start);
    }
}
