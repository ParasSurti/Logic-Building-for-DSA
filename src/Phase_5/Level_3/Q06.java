//Print the middle character(s) of a string.
package Phase_5.Level_3;

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

        int middle = 0;
        String mtStr = "";

        //even length
        if(l % 2 == 0)
        {
            middle = (l - 1)/2;
            mtStr += str.charAt(middle);
            middle = l/2;
            mtStr += str.charAt(middle);
        }
        else
        {
            middle = l/2;
            mtStr += str.charAt(middle);
        }
        System.out.println("String : [" + str + "]" + ", middle character is " + mtStr);
    }

}
