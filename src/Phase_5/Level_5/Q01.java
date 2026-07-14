//Print each word of a sentence on a new line.
package Phase_5.Level_5;

import Phase_5.OneStringTemplate;

public class Q01 extends OneStringTemplate
{
    public static void main(String[] args)
    {
        Q01 q = new Q01();
        q.setup();
        q.solve();
    }

    @Override
    protected void solve()
    {
        String  print = sentence(str,l - 1,0);
        System.out.println(print);
    }
    static String sentence(String str, int index, int i)
    {
        if(i > index) return "";
        if(str.charAt(i) != ' ' && ( i < index && str.charAt(i + 1) == ' ' )) return str.charAt(i) + "\n" + sentence(str,index,i + 1);
        else if(repeatSpace(str,i)) return sentence(str,index,i+1);
        return str.charAt(i) + sentence(str,index,i + 1);
    }
    static boolean repeatSpace(String str, int i)
    {
        return str.charAt(i) == ' ';
    }
}