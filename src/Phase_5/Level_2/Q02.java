//Count the number of digits, letters, and special characters in a string.
package Phase_5.Level_2;

import Phase_5.StringTemplate;

public class Q02 extends StringTemplate
{
    public static void main(String[] args)
    {
        Q02 q = new Q02();
        q.setup();
        q.solve();
    }
    @Override
    protected void solve()
    {
        int letter = count(str,l - 1);
        int digit = countdig(str,l - 1);
        int spCha = countSp(str,l - 1);
        System.out.println("There are " + letter + " letter's in this String!!");
        System.out.println("There are " + digit + " number's in this String!!");
        System.out.println("There are " + spCha + " special character in this String!!");
    }
    static int count(String str, int index)
    {
        if(index < 0) return 0;
        char ch = Character.toLowerCase(str.charAt(index));
        if(!isDigit(ch) && isLetter(ch))
        {
            return count(str,index - 1) + 1;
        }
        return count(str,index -1);
    }
    //Digit
    static int countdig(String str, int index)
    {
        if(index < 0) return 0;
        char ch = Character.toLowerCase(str.charAt(index));
        if(isDigit(ch) && !isLetter(ch))
        {
            return countdig(str,index - 1) + 1;
        }
        return countdig(str,index -1);
    }
    //Special Character
    static int countSp(String str, int index)
    {
        if(index < 0) return 0;
        char ch = Character.toLowerCase(str.charAt(index));
        if(!isDigit(ch) && !isLetter(ch) && ch != ' ')
        {
            return countSp(str,index - 1) + 1;
        }
        return countSp(str,index -1);
    }
    static boolean isLetter(char ch) { return ch >= 'a' && ch <= 'z';}
    static boolean isDigit(char ch)
    {
        return ch >= '0' && ch <= '9';
    }
}