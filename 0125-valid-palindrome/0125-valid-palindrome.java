class Solution {
    public boolean isPalindrome(String s) {
        int left=0;
        int right=s.length()-1;

        String lowerStr=s.toLowerCase(); 
        while(left<right)
        {
            while(left<right && !(
                                (lowerStr.charAt(left)>='a' && lowerStr.charAt(left)<='z') ||
                                (lowerStr.charAt(left) >= '0' && lowerStr.charAt(left) <= '9'))
            )
            {
                left++;
            }
            while(left<right && !(
                                (lowerStr.charAt(right)>='a' && lowerStr.charAt(right)<='z') ||
                                (lowerStr.charAt(right) >= '0' && lowerStr.charAt(right) <= '9'))
            )
            {
                right--;
            } 
            if(lowerStr.charAt(left)!=lowerStr.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;

    }
}