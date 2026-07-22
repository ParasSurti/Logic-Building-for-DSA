//Swap first and last words in a sentence.
package Phase_5.Level_5;

import Phase_5.OneStringTemplate;

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
//        String[] words = str.split("\\s+");
//        swap(words,0,words.length - 1);
//        for (int i = 0; i < words.length; i++)
//        {
//            System.out.print(words[i]);
//            if (i != words.length - 1)
//            {
//                System.out.print(" ");
//            }
//        }

        int firstEnd = firstSpace(str,0);
        if(firstEnd == 1 )
        {
            System.out.println(str);
            return;
        }

        int lastStart = lastSpace(str,l - 1);
        String middle = str.substring(firstEnd,lastStart + 1);
//        String fullWord = print(str,first,last,word);
        System.out.println(last(str,l - 1) + middle + first(str,0));
    }
    static String first(String str, int start)
    {
        if(str.charAt(start) == ' ') return "";
        return str.charAt(start) + first(str,start + 1);
    }

    static String last(String str, int last)
    {
        if(str.charAt(last) == ' ') return "";
        return last(str,last - 1) + str.charAt(last) ;
    }

    static int firstSpace(String str, int start)
    {
        if(start == str.length() || str.charAt(start) == ' ') return start;
        return firstSpace(str,start + 1);
    }

    static int lastSpace(String str, int end)
    {
        if(end == 0 || str.charAt(end) == ' ') return end;
        return lastSpace(str,end - 1);
    }

//    static void swap(String[] words ,int first, int last)
//    {
//        String temp = words[first];
//        words[first] = words[last];
//        words[last] = temp;
//    }
}
