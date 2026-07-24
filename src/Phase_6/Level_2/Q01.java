//Check if two strings are anagrams
package Phase_6.Level_2;

import Phase_6.TwoStringTemplate;

public class Q01 extends TwoStringTemplate
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
        if(l1 != l2) System.out.println("Both String " +str1 + " && " + str2  + " Not a Anagram");
        char[] words1 = str1.toCharArray();
        char[] words2 = str2.toCharArray();

        boolean check  = anagram(words1,words2,l1,l2);
        System.out.println(check);
    }
    static boolean anagram(char[] ch1, char[] ch2, int l1, int l2)
    {
        return compare(ch1,ch2,l1,l2,0);
    }
    static boolean compare(char[] ch1, char[] ch2, int l1, int l2, int i)
    {
        if(i >= ch1.length ) return true ;
        if(!compareWith(ch1,ch2,l1,l2,i,0)) return false;
        return compare(ch1, ch2, l1, l2, i + 1);
    }
    static boolean compareWith(char[] ch1, char[] ch2, int l1, int l2, int i, int j)
    {
        if(j >= ch2.length) return false;
        if(ch1[i] == ch2[j])
        {
            ch1[i] = ' ';
            ch2[j] = ' ';
            return true;
        }
        return compareWith(ch1,ch2,l1,l2,i,j + 1);
    }

}
