class Solution {
    public int trap(int[] height) {
        int len=height.length;
        int[] lMaxArr=new int[len];
        int[] rMaxArr=new int[len];

        lMaxArr[0]=height[0];
        rMaxArr[len-1]=height[len-1];
        for(int i=1;i<len;i++)
        {
            lMaxArr[i]=Math.max(height[i],lMaxArr[i-1]);
        }
        for(int i=len-2;i>=0;i--)
        {
            rMaxArr[i]=Math.max(height[i],rMaxArr[i+1]);
        }

        int total=0;
        for(int i=0;i<len;i++)
        {
            if(lMaxArr[i]>height[i] && rMaxArr[i]>height[i])
                total+=Math.min(lMaxArr[i],rMaxArr[i])-height[i];
        }

        return total;
    }
}