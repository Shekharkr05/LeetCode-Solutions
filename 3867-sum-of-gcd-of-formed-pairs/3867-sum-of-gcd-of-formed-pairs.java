class Solution {
    public long gcdSum(int[] nums) {
        int n=nums.length,max=Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
            nums[i]=prefgcd(nums[i],max);
        }
        Arrays.sort(nums);
        long sum=0;
        for(int i=0;i<n/2;i++)sum+= prefgcd(nums[i],nums[n-1-i]);
      return sum;
    }
    int prefgcd(int x,int y){
        while(y!=0){
        int temp=y;
        y=x%y;
        x=temp;
    }
    return x;
}
}