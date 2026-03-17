class Solution {
    public int pivotIndex(int[] nums) {
        int prefixSumArr[]=new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            prefixSumArr[i]=sum;
        }
        int tillSum=0;
        for(int i=0;i<nums.length;i++)
        {
            int currentSum=prefixSumArr[nums.length-1]-prefixSumArr[i];
            if(tillSum==currentSum)
                return i;
            tillSum=prefixSumArr[i];
        }

        return -1;
    }
}