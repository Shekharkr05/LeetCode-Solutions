class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        var x=0;
        var firstOne=false;
        for(int i:nums){
         if(i==0)x++;
         else if(i==1&&x<k&&firstOne==true)return false;
         else if(i==1&&firstOne==false){
            firstOne=true;
            x=0;
         }
         else if(i==1&& x>=k && firstOne==true)x=0;

        }
        return true;
        
    }
}