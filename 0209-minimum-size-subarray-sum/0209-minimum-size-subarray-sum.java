class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int minlen=Integer.MAX_VALUE;
        int sum=0;
        for(int right=0;right<nums.length;right++)
        {
            sum+=nums[right];
            while(sum>=target)
            {
                int len=right-left+1;
                if(minlen>len)
                    minlen=len;

                sum-=nums[left++];
            }
        }
        if(minlen!=Integer.MAX_VALUE)
            return minlen;
        else
            return 0;
    }
}