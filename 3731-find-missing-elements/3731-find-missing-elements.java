class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int max=nums[0],min=nums[0];
        HashSet<Integer> set=new HashSet<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            min=Math.min(min,nums[i]);
            set.add(nums[i]);
        }
        for(int i=min;i<=max;i++)if(!set.contains(i))list.add(i);
        return list;
    }
}