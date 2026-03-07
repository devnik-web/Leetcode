import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int len=nums.length;
        Set<List<Integer>> uniqueList=new HashSet<>();
        if(nums.length<3)
        {
            
            return new ArrayList<>();
        }

        for(int left=0;left<len;left++)
        {
            int mid=left+1;
            int right=len-1;
            while(mid<right)
            {
                if(nums[left]+nums[mid]+nums[right]==0)
                {
                     uniqueList.add(new ArrayList<>(
                        Arrays.asList(nums[left],nums[mid],nums[right])));
                }
                if(nums[left]+nums[mid]+nums[right]<0)
                    mid++;
                else 
                    right--;
            }
        }
        List<List<Integer>> outputList=new ArrayList<>(uniqueList);
        return outputList;
    }
}