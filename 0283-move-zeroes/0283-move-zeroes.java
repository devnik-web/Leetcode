class Solution {
    public int[] moveZeroes(int[] nums) {
        if(nums.length==1)
            return nums;
        int left=0;
        int right=1;
        int len=nums.length-1;
        while(right<=len && left<=len)
        {
            if(nums[left]!=0)
            {
                left++;
                right++;
            }
            else if(nums[right]==0)
                right++;
            else{
                nums[left]=nums[left]^nums[right];
                nums[right]=nums[left]^nums[right];
                nums[left]=nums[left]^nums[right];
                left++;
            }
        }
        return nums;
    }
}