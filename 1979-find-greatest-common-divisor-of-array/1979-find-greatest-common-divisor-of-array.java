class Solution {
    public int findGCD(int[] nums) {
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(var i:nums){
            max=Math.max(max,i);
            min=Math.min(min,i);
        }
        while(min>0){
            int temp=min;
            min=max%min;
            max=temp;
        }
        return Math.abs(max);
    }
}