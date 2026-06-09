class Solution {
    public String findDifferentBinaryString(String[] nums) {
      StringBuilder b=new StringBuilder();
      int n=nums[0].length();
      for(int i=0;i<n;i++){
        if(nums[i].charAt(i)=='0')b.append('1');
        else b.append('0');
      }
        return b+"";
    }
}