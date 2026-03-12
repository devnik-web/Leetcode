class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int zeroCount = 0;
        int maxLen = 0;

        for(int right=0;right<nums.length;right++)
        {
            if(nums[right]==0)
                zeroCount++;

            while(zeroCount>k)
            {
                if(nums[left]==0)
                    zeroCount--;
                left++;
            }

            int len=right-left+1;
            if(len>maxLen)
                maxLen = len;
        }

        return maxLen;
    }
}