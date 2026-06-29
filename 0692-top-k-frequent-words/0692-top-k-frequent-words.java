class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map=new HashMap<>();
        for(var i:words){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        List<String> list=new ArrayList<>(map.keySet());
        //check out comperetor operator if you forget
       Collections.sort(list, (a, b) -> {
    if (!map.get(a).equals(map.get(b))) {
        return map.get(b) - map.get(a);   
    }
    return a.compareTo(b);                
});
        return list.subList(0,k);
    }
}