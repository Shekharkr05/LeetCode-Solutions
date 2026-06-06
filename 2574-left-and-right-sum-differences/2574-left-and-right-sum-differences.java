class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length,sum=0;
        for(int i=0;i<n;i++){
         sum+=nums[i];
        }
        //int arr[]=new int[n];
        int k=0;
        for(int i=0;i<n;i++){
            int temp=Math.abs(sum-nums[i]-k);
            sum-=nums[i];
            k+=nums[i];
            nums[i]=temp;

        }
        return nums;
    }
}