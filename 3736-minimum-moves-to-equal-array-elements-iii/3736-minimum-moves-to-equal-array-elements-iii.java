class Solution {
    public int minMoves(int[] nums) {
        var max=0;
        for(int i=0;i<nums.length;i++)max=Math.max(max,nums[i]);
        int x=0;
        for(int i=0;i<nums.length;i++)x+=max-nums[i];
        return x;
        
    }
}