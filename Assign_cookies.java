import java.util.*;
public class Assign_cookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i =0;
        int j =0;
        int c = 0;
        while(i<g.length && j<s.length)
        {
            if(s[j] >= g[i])
            {
                c++;
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        return c;
    }
}
