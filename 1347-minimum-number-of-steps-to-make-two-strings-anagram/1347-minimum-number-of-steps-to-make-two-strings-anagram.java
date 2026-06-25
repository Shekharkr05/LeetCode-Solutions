class Solution {
    public int minSteps(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char i:s.toCharArray()){
            map.put(i,map.getOrDefault(i,0)+1);
        }
         for(char i:t.toCharArray()){
            if(map.containsKey(i))map.put(i,map.get(i)-1);
        }
        int sum=0;
        for(char i:map.keySet())if(map.get(i)>0)sum+=map.get(i);
        return sum;
    }
}