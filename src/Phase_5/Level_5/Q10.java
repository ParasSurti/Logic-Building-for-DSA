//Remove extra spaces between words (normalize spacing).
package Phase_5.Level_5;

import Phase_6.OneStringTemplate;

public class Q10 extends OneStringTemplate
{
    public static void main(String[] args) {
        Q10 q = new Q10();
        q.setup();
        q.solve();
    }
    @Override
    protected void solve()
    {
//        String[] word = str.split("\\s+");
//        for (int i = 0; i < word.length; i++)
//        {
//            if(!word[i].isEmpty())
//            {
//                System.out.print(word[i]);
//                if (i != word.length - 1)
//                {
//                    System.out.print(" ");
//                }
//            }
//        }
        String print = space(str,0,true).trim();
        System.out.println(print);
    }
    static String space(String str, int i, boolean prev)
    {
        if(i == str.length()) return "";

        char ch = str.charAt(i);

        if(ch == ' ')
        {
            if(prev)
            {
                return space(str,i + 1, true);
            }
            return " " + space(str,i + 1, true);
        }
        return str.charAt(i) + space(str,i + 1, false);
    }
}