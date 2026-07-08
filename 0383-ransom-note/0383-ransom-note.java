class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
       HashMap<Character,Integer> map=new HashMap<>();
       for(var i:magazine.toCharArray())map.put(i,map.getOrDefault(i,0)+1);
       for(var i:ransomNote.toCharArray()){
        if(!map.containsKey(i)||map.get(i)==0)return false;
        else map.put(i,map.get(i)-1);
       }
       return true;
    }
}