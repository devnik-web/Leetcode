class Solution {
    public int pivotIndex(int[] nums) {
        int prefixSum[]=new int[nums.length];
        int totalSum=0;
        for(int i=0;i<nums.length;i++)
        {
            totalSum+=nums[i];
            prefixSum[i]=totalSum;
        }
        int leftSum=0;
        for(int i=0;i<nums.length;i++)
        {
            int rightSum=prefixSum[nums.length-1]-prefixSum[i];
            if(leftSum==rightSum)
                return i;
            leftSum=prefixSum[i];
        }

        return -1;
    }
}