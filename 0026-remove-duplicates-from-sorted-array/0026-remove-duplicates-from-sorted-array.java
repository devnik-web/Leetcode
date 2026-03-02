class Solution {
    public int removeDuplicates(int[] nums) {
        int first=0,second=1;
        int len=nums.length;
        for(int i=0;i<len;i++)
        {
            if(second==len)
                return first+1;
            else{
                if(nums[first]==nums[second])
                    second++;
                else
                {
                    first++;
                    nums[first]=nums[second];
                    second++;
                }
            }
        }
        return first+1;
    }
}