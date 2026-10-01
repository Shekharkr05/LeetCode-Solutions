class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length,p=1,c=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0)c++;
            else p*=nums[i];
        
    }
    if(c>1){
        for(var i=0;i<n;i++)nums[i]=0;
    }
    if(c==1){
        for(var i=0;i<n;i++){
            if(nums[i]!=0)nums[i]=0;
            else nums[i]=p;
        }
    }
    if(c==0){
    for(var i=0;i<n;i++){
    nums[i]=p/nums[i];
    }
    }
    return nums;
    }
}