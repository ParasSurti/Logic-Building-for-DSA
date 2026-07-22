//Print all words that start and end with the same letter.
package Phase_5.Level_5;

import Phase_5.OneStringTemplate;

public class Q06 extends OneStringTemplate
{
    public static void main(String[] args) {
        Q06 q = new Q06();
        q.setup();
        q.solve();
    }
    @Override
    protected void solve()
    {
        sentence(str,l - 1,0);
    }
    static String sentence(String str, int index, int i)
    {
        if(i > index) return "";
        if(i == index || str.charAt(i + 1) == ' ')
        {
            if(firstLetter(str,i,str.charAt(i),' ') == str.charAt(i))
            {
                System.out.println(printWord(str,i));
            }
        }
        return sentence(str,index,i + 1);
    }
    static char firstLetter(String str, int i, char last, char first)
    {
        if(i == 0 || str.charAt(i - 1) == ' ') return first = str.charAt(i);
        return firstLetter(str,i - 1,last,first);
    }
    static String printWord(String str, int i)
    {
        if(i < 0 || str.charAt(i) == ' ') return "";
        return printWord(str,i - 1) + str.charAt(i) ;
    }
}