class Solution {
    public int removeElement(int[] nums, int val) {
        int c=0,x=nums.length;
        for(int i=0;i<x;i++)if(nums[i]!=val)nums[c++]=nums[i];
       
        return c;
    }
}