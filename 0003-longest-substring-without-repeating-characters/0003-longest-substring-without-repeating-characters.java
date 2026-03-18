import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set=new HashSet<>();
        int max=0;
        int count=0;
        int right=0;
        for(int i=0;i<s.length();i++)
        {
            while(right<s.length() && !set.contains(s.charAt(right)))
            {
                set.add(s.charAt(right));
                right++;
                count++;
            }
            if(count>max)
                max=count;
            count=0;
            right=i;
            set.clear();

        }
        return max;
    }
}