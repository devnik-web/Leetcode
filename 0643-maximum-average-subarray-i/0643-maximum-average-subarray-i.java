class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxAvg=0.0;
        double sum=0.0;
        for(int i=0;i<k;i++)
        {
            sum+=nums[i];
        }
        maxAvg=sum/k;
        for(int i=k;i<nums.length;i++)
        {
            sum=(sum+nums[i])-nums[i-k];
            if(sum/k>maxAvg)
                maxAvg=sum/k;
        }
        return maxAvg;

    }
}