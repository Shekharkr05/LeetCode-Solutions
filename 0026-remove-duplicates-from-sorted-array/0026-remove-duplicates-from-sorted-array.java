class Solution {
    public int removeDuplicates(int[] nums) {
        TreeSet<Integer> set=new TreeSet<>();
        for(int k:nums)set.add(k);
        var k=0;
        for(int l:set)nums[k++]=l;
        Arrays.fill(nums,set.size(),nums.length,-1);
        return set.size();

    }
}