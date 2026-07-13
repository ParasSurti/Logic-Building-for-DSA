//Shift each character by 1 (e.g., “abc” → “bcd”).
package Phase_5.Level_4;

import Phase_5.OneStringTemplate;

public class Q10 extends OneStringTemplate
{
    public static void main(String[] args)
    {
            Q10 q = new Q10();
            q.setup();
            q.solve();
    }
    @Override
    protected void solve()
    {
        String print = shift(str, l - 1,0);
        System.out.println(print);
//        char ch = 'a';
//        for (int i = 0; i <= 25; i++)
//        {
//            System.out.print((ch + i) + " ");
//        }
    }

    static String shift(String str, int l, int i)
    {
        if(i > l) return "";

        if(isLowerCase(str,i)) return Character.toString( (int) getLowerCharacter(str,i) ) + shift(str,l,i + 1);

        else if(isUpperCase(str,i)) return Character.toString( (int) getUpperCharacter(str,i) ) + shift(str,l,i + 1);

        else return str.charAt(i) + shift(str,l,i + 1);
    }

    static char getLowerCharacter(String str,int i)
    {
        char ch = str.charAt(i);
        return (char) incrementLowerCase(ch);
    }
    static char getUpperCharacter(String str,int i)
    {
        char ch = str.charAt(i);
        return (char) incrementUppercase(ch);
    }

    //here all the lowercase character with be increment
    static int incrementLowerCase(char ch)
    {
        if(ch == 122 ) return ch = 97;
        return ch + 1;
    }

    //here all the uppercase character with be increment
    static int incrementUppercase(char ch)
    {
        if(ch == 90 ) return ch = 65;
        return ch + 1;
    }

    //here we will check if it is lowercase
    static boolean isLowerCase(String str, int i)
    {
        return str.charAt(i) >= 'a' && str.charAt(i) <= 'z';
    }

    //here we will check if it is uppercase
    static boolean isUpperCase(String str, int i)
    {
        return str.charAt(i) >= 'A' && str.charAt(i) <= 'Z';
    }
}