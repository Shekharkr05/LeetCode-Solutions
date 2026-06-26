class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char i:s.toCharArray()){
           map.put(i,map.getOrDefault(i,0)+1);
        }
        int maxvo=0,maxco=0;
        for(char i:map.keySet()){
            if("aeiou".indexOf(i)!=-1)maxvo=Math.max(maxvo,map.get(i));
            else maxco=Math.max(maxco,map.get(i));
        }
        return maxco+maxvo;
    }
}