class Solution {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String,Integer> map=new HashMap<>();
        for(var i:words1)map.put(i,map.getOrDefault(i,0)+1);
         HashMap<String,Integer> map2=new HashMap<>();
        for(var i:words2)map2.put(i,map2.getOrDefault(i,0)+1);
        ArrayList<String> list=new ArrayList<>();
        for(var i:map2.keySet())if(map2.get(i)==1)list.add(i);
        var count=0;
        for(var i:list)if(map.containsKey(i)&&map.get(i)==1)count++;
        return count;
        
    }
}