class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(var i:nums)map.put(i,map.getOrDefault(i,0)+1);
        int max=0,ele=-1;
        for(int i:map.keySet()){
            if(i%2==0){
            if(map.get(i)>max){
             max=map.get(i);
             ele=i;      
            }
            else if(map.get(i)==max&&i<ele)ele=i;
            }
        }
        return ele;
    }
}