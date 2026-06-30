class Solution {
    public String kthLargestNumber(String[] nums, int k) {
       // HashSet<String> set=new HashSet<>();
        Arrays.sort(nums,(a,b)->{
            if(a.length()!=b.length())return a.length()-b.length();
         return  a.compareTo(b);

        });
        //for(var i:nums)set.add(i);
        return nums[nums.length-k];
        
    }
}