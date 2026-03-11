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
            lMax=Math.max(lMax,height[l]);      //calculates the Max left wall at each l
            rMax=Math.max(rMax,height[r]);      //calculates the Max right wall at each l

            if(lMax<rMax)           //if left wall smaller 
            {
                total+=lMax-height[l];      
                l++;
            }
            else                    //if right wall smaller
            {
                total+=rMax-height[r];
                r--;
            }
            
        }

        return total;
    }
}