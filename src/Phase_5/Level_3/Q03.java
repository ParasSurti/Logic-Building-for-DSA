//Reverse the order of words in a sentence.
package Phase_5.Level_3;

import Phase_5.StringTemplate;

public class Q03 extends StringTemplate
{
    public static void main(String[] args)
    {
        Q03 q = new Q03();
        q.setup();
        q.solve();
    }
    @Override
    protected void solve()
    {
        String print = sentence(str,l - 1);
        System.out.println(print);
    }
    static String sentence(String str, int index)
    {
        if(index < 0) return "";
        //find the index of the words before space
        if(index == 0 || str.charAt(index - 1) == ' ')
        {
            return printWord(str,index) + " " + sentence(str,index - 1);
        }
        return sentence(str,index - 1);
    }
    static String printWord(String str, int start)
    {
        if(start == str.length() || str.charAt(start) == ' ') return "";
        return str.charAt(start) + printWord(str,start + 1);
    }
}
