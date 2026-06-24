class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0,n=nums.length,count=0;
        for(int i=0;i<n;i++)sum+=nums[i];
        for(int i=0;i<n;i++){
            count+=nums[i];
            if(sum-count+nums[i]==count)return i;
        }
        return -1;
    }
}