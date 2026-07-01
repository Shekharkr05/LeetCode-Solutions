class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(var i:s.toCharArray())map.put(i,map.getOrDefault(i,0)+1);
        StringBuilder bu=new StringBuilder();
        List<Map.Entry<Character,Integer>> list=new ArrayList<>(map.entrySet());
        Collections.sort(list,(a,b)->b.getValue().compareTo(a.getValue()));
        for(Map.Entry<Character,Integer> i:list){
            bu.append((i.getKey()+"").repeat(i.getValue()));
        }
        
        return bu+"";
    }
}