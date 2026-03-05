import java.util.Arrays;
class Solution {
    public String longestCommonPrefix(String[] strs) {
        int len=strs.length;
        if (strs == null || len == 0) {
            return "";
        }
        Arrays.sort(strs);
        int i=0;
        while(i < strs[0].length() &&
                i < strs[len-1].length() && 
                    strs[0].charAt(i)==strs[len-1].charAt(i))
        {
            i++;
        }
        return strs[0].substring(0,i);
    }
}