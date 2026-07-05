//Count how many vowels and consonants are in a string.
package Phase_5.Level_2;

public class Q01 extends StringTemplate
{
    public static void main(String[] args)
    {
        Q01 q = new Q01();
        q.setup();
        q.solve();
    }
    @Override
    void solve()
    {

        int vowels = count(str,l - 1);
        int consonants = countcon(str,l - 1);
        System.out.println("There are total " + vowels + " vowels in this String!!");
        System.out.println("There are total " + consonants + " consonants in this String!!");
    }
    static int count(String str, int l)
    {
        if(l < 0) return 0;
        char ch = Character.toLowerCase(str.charAt(l));
        if(ch >= 'a' && ch <= 'z')
        {
            if(ch == 'a' || ch == 'e' ||  ch == 'i' || ch == 'o' ||  ch == 'u' )
            {
                return  count(str,l - 1) + 1;
            }
            return count(str,l - 1);
        }
        return count(str,l -1);
    }
    static int countcon(String str, int l)
    {
        if(l < 0) return 0;
        char ch = Character.toLowerCase(str.charAt(l));
        if(ch >= 'a' && ch <= 'z')
        {
            if(ch == 'a' || ch == 'e' ||  ch == 'i' || ch == 'o' ||  ch == 'u')
            {
                return  countcon(str,l -1) ;
            }
            return  countcon(str,l - 1) + 1;
        }
        return countcon(str,l - 1);
    }
}
