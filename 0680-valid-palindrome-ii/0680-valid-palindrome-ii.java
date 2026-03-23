class Solution {
    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left<right) {
            if (s.charAt(left)==s.charAt(right)) {
                left++;
                right--;
            } else {
                String sLeft=s.substring(0, left) + s.substring(left+1);
                String sRight=s.substring(0, right) + s.substring(right+1);

                int l=0,r=sLeft.length()-1;
                boolean leftValid=true;
                while (l<r) {
                    if(sLeft.charAt(l)!=sLeft.charAt(r)){
                        leftValid = false;
                        break;
                    }
                    l++;
                    r--;
                }

                l=0; 
                r=sRight.length()-1;
                boolean rightValid=true;
                while(l<r) {
                    if(sRight.charAt(l)!=sRight.charAt(r)){
                        rightValid=false;
                        break;
                    }
                    l++;
                    r--;
                }

                return leftValid || rightValid;
            }
        }
        return true;
    }
}