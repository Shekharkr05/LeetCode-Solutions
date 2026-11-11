class Solution {
    public int findMiddleIndex(int[] nums) {
        int sum=0,mid=0;
        for(var i=0;i<nums.length;i++)sum+=nums[i];
        for(var i=0;i<nums.length;i++){
            if(sum-mid-nums[i]==mid)return i;
            else mid+=nums[i];
        }

        return -1;
    }
}