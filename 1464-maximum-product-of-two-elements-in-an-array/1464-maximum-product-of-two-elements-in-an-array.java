class Solution {
    public int maxProduct(int[] nums) {
        var n=nums.length;
       Arrays.sort(nums);
       return Math.max(((nums[0]-1)*(nums[1]-1)),((nums[n-1]-1)*(nums[n-2]-1)));
    }
}