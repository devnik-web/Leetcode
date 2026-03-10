class Solution {
    public int maxArea(int[] height) {
        int max=0;
        int left=0;
        int len=height.length;
        int right=len-1;
        while(left<right)
        {
            int sum=Math.min(height[left],height[right])*(right-left);
            if(sum>max)
                max=sum;
            if(height[left]<height[right])
                left++;
            else if(height[left]>height[right])
                right--;
            else{
                left++;
                right--;
            }
        }
        return max;
    }
    
}