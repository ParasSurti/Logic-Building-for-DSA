//Find the longest word in a sentence.
package Phase_5.Level_5;

import Phase_5.OneStringTemplate;

public class Q03 extends OneStringTemplate
{
    static int bestStart = 0;
    public static void main(String[] args)
    {
        Q03 q = new Q03();
        q.setup();
        q.solve();
    }

    @Override
    protected void solve()
    {
//        System.out.println(longestWord(str));
        int print = longest(str,l - 1, 0, 0);
        String word = str.substring(bestStart, bestStart + print);
        System.out.println(word);
    }
    //With Recursion
    static int longest(String str, int index, int i, int largest)
    {
        if(i > index) return largest;
        if(largest < longWord(str, index, i, 0))
        {
            largest = longWord(str, index, i , 0);
            bestStart = i;
        }
        return longest(str,index,i + 1,largest);
    }
    static int longWord(String str, int index, int i, int largest)
    {
        if(i > index) return largest;
        if(str.charAt(i) == ' ') return largest;
        return longWord(str,index,i + 1,largest + 1);
    }


    //Without Recursion
//    static String longestWord(String str)
//    {
//        String[] words = str.split("\\s+");
//        String longest = words[0];
//        for (int i = 0; i < words.length; i++  )
//        {
//            if(words[i].length() > longest.length())
//            {
//                longest = words[i];
//            }
//        }
//        return longest;
//    }
}