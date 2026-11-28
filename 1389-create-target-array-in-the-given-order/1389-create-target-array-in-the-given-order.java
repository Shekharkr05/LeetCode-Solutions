class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
    List<Integer> list=new ArrayList<>();
    var x=0;
    for(int i:nums)list.add(index[x++],i);
    x=0;
    for(var i:list)nums[x++]=i;
    return nums;
        
    }
}