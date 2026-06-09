class Solution {
    public long[] findPrefixScore(int[] nums) {
        Long sum=0L,max=Long.MIN_VALUE;
        long arr[]=new long[nums.length];
        for(int i=0;i<nums.length;i++){
           max=Math.max(nums[i],max);
           sum+=max+nums[i];
           arr[i]=sum;
          }
        return arr;
    }
}