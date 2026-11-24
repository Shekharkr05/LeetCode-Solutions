class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int arr[]=new int[nums.length];
        int t=0;
        for(int i:nums){
            arr[t++]=greater(nums,i);

        }
        return arr;
        
    }
    int greater(int [] arr,int val){
        int c=0;
        for(int x:arr)if(x<val)c++;
        return c;
    }
}