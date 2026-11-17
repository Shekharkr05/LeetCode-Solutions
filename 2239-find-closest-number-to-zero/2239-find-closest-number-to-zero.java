class Solution {
    public int findClosestNumber(int[] nums) {
        int near=Integer.MAX_VALUE,val=0;
        for(int i=0;i<nums.length;i++){
            if(Math.abs(nums[i]-0)<near){
                near=Math.abs(nums[i]);
                val=nums[i];
            }
            else if(Math.abs(nums[i]-0)==near&&nums[i]>val)val=nums[i];
                
            
        }
        return val;
    }
}