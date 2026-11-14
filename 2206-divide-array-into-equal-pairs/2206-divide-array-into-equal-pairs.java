class Solution {
    public boolean divideArray(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        if(nums.length%2!=0)return false;
        for(int i:nums)map.put(i,map.getOrDefault(i,0)+1);
        for(int key:map.keySet())if(map.get(key)%2!=0)return false;
        return true;

        
    }
}