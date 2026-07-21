//Find the shortest word in a sentence.
package Phase_5.Level_5;

import Phase_5.OneStringTemplate;

public class Q04 extends OneStringTemplate
{
    static int bestStart = 0;
    public static void main(String[] args)
    {
        Q04 q  = new Q04();
        q.setup();
        q.solve();
    }
    @Override
    protected void solve()
    {
//        System.out.println(smallest(str));
        int print = small(str,l  - 1,Integer.MAX_VALUE);
        String word = str.substring(bestStart, bestStart + print);
        System.out.println(word);
    }
     static int small(String str, int index, int smallest)
     {
         if(index < 0) return smallest;
         if(str.charAt (index) != ' ' && (index == 0 && smallest >= smallWord(str,index,0)  || smallest >= smallWord(str,index,0 ) && str.charAt(index - 1) == ' ') )
         {
            smallest = smallWord(str,index,0);
            bestStart = index;
         }
         return small(str,index - 1,smallest);
     }
     static int smallWord(String str, int index, int count)
     {
         if(index == str.length()) return count;
         if(str.charAt(index) == ' ') return count;
         return smallWord(str,index + 1,count + 1);
     }

//    static String smallest(String str)
//    {
//        String[] words = str.split("\\s+");
//        String word = words[0];
//        for (int i = 0; i < words.length; i++)
//        {
//            if(word.length() > words[i].length())
//            {
//                word = words[i];
//            }
//        }
//        return word;
//    }

}
