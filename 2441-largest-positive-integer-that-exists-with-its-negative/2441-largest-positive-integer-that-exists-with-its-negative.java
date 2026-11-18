class Solution {
    public int findMaxK(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(var i:nums)set.add(i);
        var max=-1;
        for(int i:set)if(i>0&&set.contains(i*-1)&&i>max)max=i;
        return max;
    }
}