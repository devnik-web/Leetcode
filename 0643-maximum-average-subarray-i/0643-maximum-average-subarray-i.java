class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int start=0;
        double maxAvg=0.0;
        double sum=0.0;
        int len=nums.length;
        for(int i=0;i<k;i++)
        {
            sum+=nums[i];
        }
        maxAvg=sum/k;
        for(int i=k;i<len;i++)
        {
            sum=(sum+nums[i])-nums[start];
            if(sum/k>maxAvg)
                maxAvg=sum/k;
            start++;
        }
        return maxAvg;

    }
}