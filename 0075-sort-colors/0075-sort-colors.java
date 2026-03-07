class Solution {
    public void sortColors(int[] nums) {
        int zeroCount=0;
        int oneCount=0;
        int twoCount=0;
        int len=nums.length;
        for(int i=0;i<len;i++)
        {
            switch(nums[i])
            {
                case 0:
                    zeroCount++;
                    break;
                case 1:
                    oneCount++;
                    break;
                case 2:
                    twoCount++;
                    break;    
            }
        }
        int index=0;
        while(zeroCount-->0 &&index<len)
            nums[index++]=0;
        while(oneCount-->0 &&index<len)
            nums[index++]=1;
        while(twoCount-->0 &&index<len)
            nums[index++]=2;
    }
}