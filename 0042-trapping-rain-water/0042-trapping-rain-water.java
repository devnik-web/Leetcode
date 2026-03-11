class Solution {
    public int trap(int[] height) {
        int len=height.length;
        int l=0;        //left pointer
        int r=len-1;    //right pointer
        int lMax=0;     //max value seen till left pointer
        int rMax=0;     //max value seen untill right pointer 
        int total=0;    //total water

        //traversing from both side (left and right)
        while(l<r)
        {
            if(height[l]<height[r])         //decides which current wall is smaller 
            {
                if(height[l]>=lMax)
                {
                    lMax=height[l];
                }
                else
                {
                    total+=lMax-height[l];
                }
                l++;
            }
            else
            {
                if(height[r]>=rMax)
                {
                    rMax=height[r];
                }
                else
                {
                    total+=rMax-height[r];
                }
                r--;
            }
        }

        return total;
    }
}