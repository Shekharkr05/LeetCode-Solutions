class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length,zero=1,pro=1,count=0;
        for(int i=0;i<n;i++){
       if(nums[i]!=0)pro*=nums[i];
       else {
        zero=0;
        count++;
       }
        }
        
        int arr[]=new int[n];
        if(count>1) {
            for(int i=0;i<n;i++){
                arr[i]=0;
            }
            return arr;
        }
        for(int i=0;i<n;i++){
        if(zero==1){
        arr[i]=pro/nums[i];
        }else{
        if(nums[i]!=0){
            arr[i]=0;
        }else{
            arr[i]=pro;
        }
        }
        }
        return arr;
    }
}